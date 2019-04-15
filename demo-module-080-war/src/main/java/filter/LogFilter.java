package filter;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // 获取初始化参数
        String site = filterConfig.getInitParameter("User");

        // 输出初始化参数
        System.out.println("User name: " + site);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("do filter .......");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
