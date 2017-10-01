package com.midas.wechat.service.impl;

import com.alibaba.fastjson.JSON;
import com.midas.framework.exception.SystemException;
import com.midas.wechat.bto.AccessTokenBto;
import com.midas.wechat.communication.WeChatApi;
import com.midas.wechat.error.ErrorCode;
import com.midas.wechat.service.WeChatService;
import com.midas.wechat.system.OfficialAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * Created by User on 2017/9/12.
 */
@Service
public class WeChatServiceImpl implements WeChatService {

    @Autowired
    private OfficialAccount officialAccount;

    @Override
    public String getCurrentWeChatAccessToken() throws IOException, SystemException {
        String access_token = officialAccount.getAccountToken();
        if (StringUtils.hasText(access_token)) {
            return access_token;
        }
        return getNewWeChatAccessToken();
    }

    @Override
    public String getNewWeChatAccessToken() throws IOException, SystemException {
        AccessTokenBto accessTokenBto = JSON.parseObject(WeChatApi.doGetAccessToken(officialAccount), AccessTokenBto.class);
        if (StringUtils.hasText(accessTokenBto.getAccess_token())) {
            officialAccount.setAccountToken(accessTokenBto.getAccess_token());
            return accessTokenBto.getAccess_token();
        } else {
            ErrorCode errorCode = ErrorCode.getErrorCodeByErrcode(accessTokenBto.getErrcode());
            if (errorCode != null) {
                throw new SystemException("WeChat-Error:" + errorCode.getErrmsg());
            } else {
                throw new SystemException("NetWork-Error:微信服务请求失败！");
            }
        }
    }
}
