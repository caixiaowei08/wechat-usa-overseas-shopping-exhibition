package com.midas.business.collection.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2017/9/13.
 */
public class CollectionEntity implements Serializable {

    /**
     * 主键
     */
    private Integer id;
    /**
     * 订单主键
     */
    private Integer orderIPid;
    /**
     *账户主键
     */
    private Integer accountPid;
    /**
     * 创建时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderIPid() {
        return orderIPid;
    }

    public void setOrderIPid(Integer orderIPid) {
        this.orderIPid = orderIPid;
    }

    public Integer getAccountPid() {
        return accountPid;
    }

    public void setAccountPid(Integer accountPid) {
        this.accountPid = accountPid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
