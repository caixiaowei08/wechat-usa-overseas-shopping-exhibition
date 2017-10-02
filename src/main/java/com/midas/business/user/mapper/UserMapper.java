package com.midas.business.user.mapper;

import com.midas.business.user.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by User on 2017/9/13.
 */
@Mapper
@Repository
public interface UserMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "openId", column = "openId"),
            @Result(property = "weChat", column = "weChat"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "nickName", column = "nickName"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "city", column = "city"),
            @Result(property = "country", column = "country"),
            @Result(property = "province", column = "province"),
            @Result(property = "language", column = "language"),
            @Result(property = "headImgUrl", column = "headImgUrl"),
            @Result(property = "subscribeTime", column = "subscribeTime"),
            @Result(property = "unionId", column = "unionId"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "subscribe", column = "subscribe"),
            @Result(property = "createTime", column = "createTime"),
            @Result(property = "updateTime", column = "updateTime")
    })
    @Select("SELECT * FROM amazon_wechat_official_account")
    List<UserEntity> findAll();

    @Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
    void insert(UserEntity userEntity);



}
