package com.midas.business.user.service;

import com.midas.business.user.entity.UserEntity;

import java.util.List;

/**
 * Created by User on 2017/9/13.
 */
public interface UserService {

    List<UserEntity> findAll(UserEntity userEntity, int pageNum, int pageSize);

}
