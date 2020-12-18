<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/11/20
  Time: 12:40 PM
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
        <h1 class="display-5">Error 404: Resource Not Found</h1>
    </div>

    <div class="container">
        <p class="lead">I'm terribly sorry master Bruce, but whatever it is you are looking for simply is not here.
            Might I suggest retracing your steps?</p>
        <a href="index.jsp"> Take me home!</a>
    </div>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
