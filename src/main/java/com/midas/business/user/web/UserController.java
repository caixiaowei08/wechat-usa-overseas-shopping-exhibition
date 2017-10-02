package com.midas.business.user.web;

import com.midas.business.user.entity.UserEntity;
import com.midas.business.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by User on 2017/9/13.
 */
@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserPagingQuery")
    public List<UserEntity> findUserPagingQuery(
            UserEntity userEntity,
            @RequestParam("pageNum") Integer pageNum,
            @RequestParam("pageSize") Integer pageSize
    ) {
        return userService.findAll(userEntity, pageNum, pageSize);
    }


}
