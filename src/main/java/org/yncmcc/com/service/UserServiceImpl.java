package org.yncmcc.com.service;

import org.yncmcc.com.bean.User;

public class UserServiceImpl implements UserService{
    public User getUser(String name) {
        User u=new User();
        u.setUsername(name);
        u.setPassword("123456");
        return u;
    }
}