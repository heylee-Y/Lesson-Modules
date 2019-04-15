<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-20
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date createTime = new Date(session.getCreationTime());
    Date lastAccessTime = new Date(session.getLastAccessedTime());
    int visitCount = 0;
    String visitCountKey = "visitCount";
    String userIDKey = "userId";
    String userID = "heylee";

    if (session.isNew()) {
        session.setAttribute(userIDKey, userID);
        session.setAttribute(visitCountKey, visitCount);
    } else {
        visitCount = Integer.parseInt(String.valueOf(session.getAttribute(visitCountKey)));
        visitCount++;
        userID = (String) session.getAttribute(userIDKey);
        session.setAttribute(visitCountKey, visitCount);
    }
%>
</body>


<h1>Session 跟踪</h1>

<table border="1" align="center">
    <tr bgcolor="#87cefa">
        <th>Session 信息</th>
        <th>值</th>
    </tr>
    <tr>
        <td>id</td>
        <td><% out.print(session.getId()); %></td>
    </tr>
    <tr>
        <td>创建时间</td>
        <td><% out.print(createTime); %></td>
    </tr>
    <tr>
        <td>最后访问时间</td>
        <td><% out.print(lastAccessTime); %></td>
    </tr>
    <tr>
        <td>用户 ID</td>
        <td><% out.print(userID); %></td>
    </tr>
    <tr>
        <td>访问次数</td>
        <td><% out.print(visitCount); %></td>
    </tr>
</table>
</html>
