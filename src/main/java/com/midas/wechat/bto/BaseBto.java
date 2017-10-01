package com.midas.wechat.bto;

import java.io.Serializable;

/**
 * Created by User on 2017/9/12.
 */
public abstract class BaseBto implements Serializable {

    private Integer errcode;

    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
