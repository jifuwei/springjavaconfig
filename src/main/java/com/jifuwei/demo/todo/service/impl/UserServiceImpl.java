package com.jifuwei.demo.todo.service.impl;

import com.jifuwei.demo.todo.dao.UserMapper;
import com.jifuwei.demo.todo.data.User;
import com.jifuwei.demo.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JFW on 2017/4/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
