<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/11/20
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Batman Film Database</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="jumbotron">
    <h1 class="display-4">Welcome to the Batman Film Database</h1>
</div>

    <%@include file="includes/navigation.jsp"%>

    <div class="container">
        <p class="lead">The Batman Film Database exists to connect fans with a searchable database of all Batman
            films produced through the years. We aspire to collect facts and trivia, rare media, interviews, and
            other archival content related to all things Batman.</p>
    </div>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
