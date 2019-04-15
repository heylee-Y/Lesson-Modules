package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.LogUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/helloServlet")
@WebServlet(value = "/helloServlet")
public class Servlet01 extends HttpServlet {

    Logger logger = LogUtil.getBusinessLogger();
    Logger log = LoggerFactory.getLogger(Servlet01.class);

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        log.info("execute service method");
        PrintWriter out = servletResponse.getWriter();
        out.println("servlet service success!!!");

        String path_01 = this.getClass().getResource("/").getPath();
        String path_02 = this.getClass().getClassLoader().getResource("/").getPath();
        String path_02_1 = this.getClass().getClassLoader().getResource(".").getPath();
        String path_03 = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String path_04 = Thread.currentThread().getContextClassLoader().getResource("images/top_logo.png").getPath();

        log.info(path_01);
        log.info(path_02);
        log.info(path_02_1);
        log.info(path_03);
        log.info(path_04);
        log.info(System.getProperty("user.dir"));
    }
}
