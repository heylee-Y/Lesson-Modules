import model.DemoUser;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.junit.Test;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class TestLock {

    @Test
    public void test01() {

        Session session = HibernateUtil.getSession();
        try {
            session.getTransaction().begin();

//            String sql = "select u from " + DemoUser.class.getName() + " u order by u.updateTime desc ";
//            String sql = "select * from demo.demo_user";

            // 悲观锁
//            DemoUser demoUser = session.get(DemoUser.class, 1L, LockMode.UPGRADE);

            // 乐观锁 version
            DemoUser demoUser = session.get(DemoUser.class, 1L);
            demoUser.setName("william");
            session.save(demoUser);

            System.out.println(demoUser);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void test02() {

        Session session = HibernateUtil.getSession();
        try {
            session.getTransaction().begin();

//            String sql = "select u from " + DemoUser.class.getName() + " u order by u.updateTime desc ";
//            String sql = "select * from demo.demo_user";

//            DemoUser demoUser = session.get(DemoUser.class, 1L, LockMode.UPGRADE);
            DemoUser demoUser = session.get(DemoUser.class, 1L);
//            demoUser.setRole("subscriber");
            demoUser.setRole("admin");
            session.save(demoUser);

            System.out.println(demoUser);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
}
