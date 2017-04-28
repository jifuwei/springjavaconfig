package com.jifuwei.demo.todo.dao;

import com.jifuwei.demo.todo.data.User;

import java.util.List;

/**
 * Created by JFW on 2017/4/28.
 */
public interface UserMapper {
    /**
     * @return all the users
     */
    public List<User> getAllUsers();
    /**
     * @param user
     * @return the number of rows affected
     */
    public int insertUser(User user);
    /**
     * @param user
     * @return the number of rows affected
     */
    public int updateUser(User user);
}
