package com.heylee.service;

import com.heylee.dao.DemoUserDao;
import com.heylee.model.DemoUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class DemoUserServiceImpl implements DemoUserService {

    @Autowired
    private DemoUserDao userDao;

    public List<DemoUser> findAllUsers() {
        return userDao.findAllUsers();
    }

    public List<DemoUser> getAllUsers() {
        return userDao.getAllUsers();
    }

    public DemoUser getById(Long id) {
        return userDao.getById(id);
    }

    public void updateUser(DemoUser demoUser) {
        userDao.updateUser(demoUser);
    }
}
