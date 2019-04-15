package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerTest implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet context init");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet context destory");
    }
}
