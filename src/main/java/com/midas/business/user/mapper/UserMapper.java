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
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT * FROM user WHERE age = #{age}")
    List<UserEntity> getAll(Integer age);

    @Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
    void insert(UserEntity userEntity);



}
