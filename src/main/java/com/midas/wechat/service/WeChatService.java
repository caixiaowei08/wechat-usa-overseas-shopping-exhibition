package com.midas.wechat.service;

import com.midas.framework.exception.SystemException;

import java.io.IOException;

/**
 * Created by User on 2017/9/12.
 */
public interface WeChatService {

    //获取当前的access_token
    String getCurrentWeChatAccessToken() throws IOException, SystemException;

    //获取新的access_token
    String getNewWeChatAccessToken() throws IOException, SystemException;


}
