package servlet;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet_01 implements Servlet {

    private static final Logger logger = Logger.getLogger(DemoServlet_01.class);

    public DemoServlet_01() {

        System.out.println("------- tomcat instantiate servlet -------");
        logger.info("------- log4j tomcat instantiate servlet -------");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("------- servlet execute init method -------");
        logger.info("------- log4j servlet execute init method -------");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("------- servlet execute service method -------");
        logger.info("------- log4j servlet execute service method -------");
        PrintWriter out = res.getWriter();
        out.println("success servlet service!!!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

        System.out.println("------- servlet execute destroy method -------");
        logger.info("------- log4j servlet execute destroy method -------");
    }
}
