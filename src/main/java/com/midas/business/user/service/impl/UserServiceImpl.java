package com.midas.business.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.midas.business.user.entity.UserEntity;
import com.midas.business.user.mapper.UserMapper;
import com.midas.business.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 2017/9/13.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findAll(UserEntity userEntity, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.findAll();
    }
}
