package Test;

import dao.DemoUserDao;
import model.DemoUser;

import java.util.List;

public class TestJDBC {

    public static void main(String[] args) {
        DemoUserDao demoUserDao = new DemoUserDao();
        List<DemoUser> list = demoUserDao.getUsers();
        for (DemoUser user : list) {
            System.out.println(user.getName());
        }
    }
}
