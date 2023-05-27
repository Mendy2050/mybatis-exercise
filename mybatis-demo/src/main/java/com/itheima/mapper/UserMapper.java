package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-04-09 15:56
 */
public interface UserMapper {


    List<User> selectAll();
    User selectById(int id);
}
