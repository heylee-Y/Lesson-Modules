package spring.dao;

import spring.model.DemoUser;

import java.util.List;

public interface DemoUserDao {

    public void insert(DemoUser demoUser);

    public DemoUser findUserById(Long id);

    public List<DemoUser> findAllUsers();
}
