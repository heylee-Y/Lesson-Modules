package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(value = "/exception")
public class Servlet02 extends HttpServlet {

    Logger log = LoggerFactory.getLogger(Servlet02.class);

}
