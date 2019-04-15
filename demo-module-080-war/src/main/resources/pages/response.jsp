<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-16
  Time: 00:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>自动刷新</title>
</head>
<body>
<h2>自动刷新实例</h2>
<%
    // 设置每隔5秒自动刷新
    response.setIntHeader("Refresh", 5);
    // 获取当前时间
    Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if (calendar.get(Calendar.AM_PM) == 0)
        am_pm = "AM";
    else
        am_pm = "PM";
    String CT = hour + ":" + minute + ":" + second + " " + am_pm;
    out.println("当前时间: " + CT + "\n");
%>
</body>
</html>
