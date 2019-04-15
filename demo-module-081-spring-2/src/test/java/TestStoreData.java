import model.DemoUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

public class TestStoreData {

    @Test
    public void test() {
        Configuration configuration = new Configuration();
        configuration.configure("hbm_xml/hibernate.cfg.xml");

        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        DemoUser demoUser = new DemoUser();
        demoUser.setId(100L);
        demoUser.setRole("chair man");
        demoUser.setPassword("0105");
        demoUser.setName("yang");
        demoUser.setComment("haha");
        demoUser.setUpdateTime(new Date());

        session.persist(demoUser);
        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
}
