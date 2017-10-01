package com.midas.wechat.url;

/**
 * 微信所有的请求链接
 * Created by User on 2017/9/12.
 */
public class RequestUrl {

    /**
     * 获取access_token 传入APPID和APPSECRET
     */
    public static final String URL_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

}
