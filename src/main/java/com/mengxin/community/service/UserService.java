package com.mengxin.community.service;

import com.mengxin.community.dao.UserMapper;
import com.mengxin.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mx
 * @date 2020/4/22 - 12:15
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
