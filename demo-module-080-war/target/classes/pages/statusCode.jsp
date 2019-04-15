<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-18
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting HTTP Status Code</title>
</head>
<body>
<%
    response.sendError(400, "Wow!!!");
//        response.sendError(400,"Wow!!!");
%>
</body>
</html>
