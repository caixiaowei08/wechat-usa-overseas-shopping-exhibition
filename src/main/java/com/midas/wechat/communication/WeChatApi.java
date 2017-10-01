package com.midas.wechat.communication;

import com.midas.utils.http.HttpUtils;
import com.midas.wechat.system.OfficialAccount;
import com.midas.wechat.url.RequestUrl;

import java.io.IOException;

/**
 * Created by User on 2017/9/12.
 */
public class WeChatApi {

    public static String doGetAccessToken(OfficialAccount officialAccount) throws IOException {
        String url = RequestUrl.URL_ACCESS_TOKEN
                .replace("APPID", officialAccount.getAppId())
                .replace("APPSECRET", officialAccount.getAppSecret());
        return HttpUtils.doGet(url);
    }

}
