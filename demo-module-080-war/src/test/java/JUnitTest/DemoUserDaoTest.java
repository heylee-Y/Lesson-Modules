package JUnitTest;

import dao.DemoUserDao;
import model.DemoUser;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DemoUserDaoTest {

    private DemoUserDao demoUserDao;

    @Before
    public void before() {
        demoUserDao = new DemoUserDao();
    }

    @Test
    public void testQueryAll() {
        List<DemoUser> list = demoUserDao.getAllUsers();

        for (DemoUser demoUser : list) {
            System.out.println(demoUser.getName() + " " + demoUser.getRole() + " " + demoUser.getUpdateTime());
        }
    }
}
