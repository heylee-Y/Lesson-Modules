<%@ page import="java.util.*,java.io.*" %><%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-16
  Time: 00:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Http Header Request Test</title>
</head>
<body>
<h2>HTTP 头部请求实例</h2>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th>
        <th>Header Value(s)</th>
    </tr>
        <%
   Enumeration headerNames = request.getHeaderNames();
   while(headerNames.hasMoreElements()) {
      String paramName = (String)headerNames.nextElement();
      out.print("<tr><td>" + paramName + "</td>\n");
      String paramValue = request.getHeader(paramName);
      out.println("<td> " + paramValue + "</td></tr>\n");
   }
%>
</body>
</html>
