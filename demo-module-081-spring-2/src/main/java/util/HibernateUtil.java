package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    /**
     * init sessionFactory
     */
    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory = null;
        Configuration configuration = new Configuration().configure("hbm_xml/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();

        return sessionFactory;
    }

    /**
     * get session
     */
    public static Session getSession() {
        //得到session
        Session session = sessionFactory.openSession();
        return session;
    }
}
