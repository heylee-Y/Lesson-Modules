package com.heylee.dao;

import com.heylee.model.DemoUser;

import java.util.List;

public interface DemoUserDao {
    List<DemoUser> findAllUsers();

    List<DemoUser> getAllUsers();

    void updateUser(DemoUser demoUser);

    DemoUser getById(Long id);
}
