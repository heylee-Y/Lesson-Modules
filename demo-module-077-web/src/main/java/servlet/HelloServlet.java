package servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.LogUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(HelloServlet.class);
    private static final org.slf4j.Logger LOGGER = LogUtil.getBusinessLogger();

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        super.service(servletRequest, servletResponse);
        System.out.println("------- servlet execute service method -------");
        String user = servletRequest.getParameter("user");

        logger.info(" log4j2 ------- {} -------", user);

//        HttpServletRequest
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        httpServletRequest.get

        PrintWriter out = servletResponse.getWriter();
        out.println("Aha hi servlet!!!");

    }
}
