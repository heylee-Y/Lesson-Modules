<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-03-06
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Submit</title>
</head>
<body>
<form action="/demo-springMVC/mvc/param" method="post">
    <table>
        <tbody>
        <tr>
            <td>User:</td>
            <td><input name="user" type="text"></td>

        </tr>
        <tr>
            <td>Passowrd:</td>
            <td><input name="pwd" type="password"></td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Submit">
</form>

<form action="/demo-springMVC/mvc/param2" method="post">
    <table>
        <tbody>
        <tr>
            <td>User:</td>
            <td><input name="user" type="text"></td>

        </tr>
        <tr>
            <td>Passowrd:</td>
            <td><input name="pwd" type="password"></td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Submit2">
</form>
</body>
</html>
