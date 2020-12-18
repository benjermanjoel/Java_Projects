<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/23/20
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Web Programming: Populate Class Roster</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="hero-unit">
        <h1>Populate Class Roster</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <p>WARNING: this will overwrite the existing database.</p>
    <div class="container">
        <form action="populateDB" method="post">
            <input type="submit" value="Populate DB">
        </form>
    </div>
    <h3 style="color: #c82333">${message}</h3>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
