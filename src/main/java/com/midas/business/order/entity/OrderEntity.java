package com.midas.business.order.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2017/9/13.
 */
public class OrderEntity implements Serializable{
    /**
     *主键
     */
    private Integer id;
    /**
     *订单编号
     */
    private Integer orderId;
    /**
     *卖家编号
     */
    private Integer sellerId;
    /**
     *产品ASIN
     */
    private String asinId;
    /**
     *商品店址
     */
    private String productUrl;
    /**
     *商品标题
     */
    private String productTitle;
    /**
     *店家标识
     */
    private String brand;
    /**
     *商品图片
     */
    private String pic;
    /**
     *产品分类
     */
    private Integer classification;
    /**
     *订单状态
     */
    private Integer state;
    /**
     *目标评价
     */
    private Integer needReviewNum;
    /**
     *已下订单
     */
    private Integer orderNum;
    /**
     *上架时间
     */
    private Date shelfTime;
    /**
     *获取方式
     */
    private String pattern;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getAsinId() {
        return asinId;
    }

    public void setAsinId(String asinId) {
        this.asinId = asinId;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNeedReviewNum() {
        return needReviewNum;
    }

    public void setNeedReviewNum(Integer needReviewNum) {
        this.needReviewNum = needReviewNum;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
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
