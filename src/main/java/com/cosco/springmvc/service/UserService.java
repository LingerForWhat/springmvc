package com.cosco.springmvc.service;

import com.cosco.springmvc.pojo.User;

import java.util.List;

/**
 * Created by linzixuan on 15/12/3.
 */
public interface UserService {
    public User getUserById(int userId);

//    获取用户对象by name
    public User getUserByName(String name) throws Exception;

    public boolean Useradd(User user);

    public boolean UserUpdate(User user);

    public boolean UserDelete(int userId);

    public User userDetail(int userId);

    public List<User> userList(User user, int num);


}
