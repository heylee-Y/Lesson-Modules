<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-19
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>使用 GET 方法读取数据</h1>
<ul>
    <li><p><b>站点名:</b>
        <%= request.getParameter("name")%>
    </p></li>
    <li><p><b>网址:</b>
        <%= request.getParameter("role")%>
    </p></li>
</ul>
</body>
</html>
