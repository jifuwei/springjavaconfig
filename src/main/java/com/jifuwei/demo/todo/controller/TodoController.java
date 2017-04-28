package com.jifuwei.demo.todo.controller;

import com.jifuwei.demo.todo.data.User;
import com.jifuwei.demo.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JFW on 2017/4/28.
 */
@Controller
public class TodoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> users(Model model) {
        return userService.getAllUsers();
    }
}
