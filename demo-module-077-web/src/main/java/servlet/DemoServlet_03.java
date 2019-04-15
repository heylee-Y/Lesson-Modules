package servlet;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.LogUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet_03 extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServlet_03.class);

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(DemoServlet_03.class);

    private static final Logger log = LogUtil.getBusinessLogger();

    public DemoServlet_03() {
        System.out.println("------- tomcat instantiate servlet -------");
    }

    public void init() throws ServletException {
        super.init();
        System.out.println("------- servlet execute init method -------");
        LOGGER.info("slf4 & log4j2 --- servlet execute init method");
        logger.info(" log4j2 --- servlet execute init method");
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        super.service(servletRequest, servletResponse);
        System.out.println("------- servlet execute service method -------");
        LOGGER.info("slf4 & log4j2 --- servlet execute service method");
        logger.info(" log4j2 --- servlet execute service method");
        log.info("wow business info log !!!");
        log.error("dame it, business error log !!!");
        log.warn("warning, business warning log !!!");
        PrintWriter out = servletResponse.getWriter();
        out.println("servlet 03 service");
    }

    public void destroy() {
        super.destroy();
        System.out.println("------- servlet execute destroy method -------");
        LOGGER.info("slf4 & log4j2 --- servlet execute destroy method");
        logger.info(" log4j2 --- servlet execute destroy method");
    }
}
