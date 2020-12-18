<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/24/20
  Time: 7:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Batman Film Database</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="jumbotron">
        <h1 class="display-4">Populate the Batman Film Database</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div>
        <p class="lead">Warning: this will overwrite the existing database!</p>
    </div>

    <div class="container">
        <form action="populateDB" method="post">
            <input type="submit" value="Populate DB">
        </form>
    </div>
    <h3 style="color: #c82333">${message}</h3>

    <%@include file="includes/footer.jsp"%>


</body>
</html>
