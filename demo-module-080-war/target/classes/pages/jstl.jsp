<%--
  Created by IntelliJ IDEA.
  User: heylee
  Date: 2019-02-20
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="hello" uri="www.heylee.jstl.hello.com" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hello:hello/>
${pageContext.findAttribute("")}
${pageContext.forward("")}

${pageScope.get("")}
</body>
</html>
