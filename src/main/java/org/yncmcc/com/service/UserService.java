package org.yncmcc.com.service;

import javax.jws.WebService;

import org.yncmcc.com.bean.User;

@WebService
public interface UserService {
    public User getUser(String name);
}