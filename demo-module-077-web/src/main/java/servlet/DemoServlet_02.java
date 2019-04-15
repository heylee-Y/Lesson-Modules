package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class DemoServlet_02 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("------- servlet execute service method -------");
    }
}
