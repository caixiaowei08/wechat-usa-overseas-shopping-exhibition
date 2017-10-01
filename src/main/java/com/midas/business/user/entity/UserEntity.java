package com.midas.business.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2017/9/13.
 */
public class UserEntity implements Serializable {
    /**
     *主键
     */
    private Integer id;
    /**
     *用户的标识
     */
    private String openId;
    /**
     *微信号
     */
    private String wechat;
    /**
     *手机号
     */
    private String phone;
    /**
     *用户昵称
     */
    private String nickname;
    /**
     *性别
     */
    private Integer sex;
    /**
     *城市
     */
    private Integer city;
    /**
     *国家
     */
    private String country;
    /**
     *省份
     */
    private String province;
    /**
     *语言
     */
    private String language;
    /**
     *用户头像
     */
    private String headimgurl;
    /**
     *关注时间
     */
    private Date subscribeTime;
    /**
     *绑定编号
     */
    private String unionid;
    /**
     *'粉丝备注
     */
    private String remark;
    /**
     *订阅标识
     */
    private Integer subscribe;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *  更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
