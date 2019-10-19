package com.frozenfire.dyncsource.service.impl;


import com.frozenfire.dyncsource.dao.UserDao;
import com.frozenfire.dyncsource.entity.User;
import com.frozenfire.dyncsource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
