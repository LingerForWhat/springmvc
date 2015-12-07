package com.cosco.springmvc.service.impl;

import com.cosco.springmvc.dao.IUserDao;
import com.cosco.springmvc.pojo.User;

import com.cosco.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linzixuan on 15/12/3.
 */

@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private IUserDao userDao;





    public IUserDao getUserDao() {
        return userDao;
    }

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    public User getUserByName(String name) throws Exception {

        return this.userDao.selectByUserName(name);

    }

    public boolean Useradd(User user) {
        return false;
    }

    public boolean UserUpdate(User user) {
        return false;
    }

    public boolean UserDelete(int userId) {
        return false;
    }

    public User userDetail(int userId) {
        return null;
    }

    public List<User> userList(User user, int num) {
        return null;
    }
}
