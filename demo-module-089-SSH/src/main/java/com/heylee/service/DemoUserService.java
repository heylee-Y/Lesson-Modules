package com.heylee.service;

import com.heylee.model.DemoUser;

import java.util.List;

public interface DemoUserService {
    List<DemoUser> findAllUsers();

    List<DemoUser> getAllUsers();

    void updateUser(DemoUser demoUser);

    DemoUser getById(Long id);
}
