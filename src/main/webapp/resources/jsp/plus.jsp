<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: turbo
  Date: 9.5.17
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator | Plus</title>
</head>
<body>

<sf:form action="/calculations/plus" method="post" modelAttribute="" >

    <sf:label path="intermediate">INTM</sf:label> <sf:input path="intermediate"/> <sf:errors path="intermediate"/> <br>
    <sf:label path="new">NEW</sf:label> <sf:input path="new"/> <sf:errors path="new"/> <br>

    <button type="submit">+</button>
</sf:form>

</body>
</html>
