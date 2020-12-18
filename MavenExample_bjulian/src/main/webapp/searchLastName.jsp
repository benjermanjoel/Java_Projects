<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/16/20
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Web Programming: Search</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="hero-unit">
        <h1>Search by Last name</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div class="container">
        <form action="searchLastName" method="get">
            <label for="lastName">Search by last name</label>
            <input type="text" name="lastName" id="lastName">
            <input type="submit">
        </form>

    </div>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
