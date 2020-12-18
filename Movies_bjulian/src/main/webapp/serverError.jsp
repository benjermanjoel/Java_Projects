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
    <title>Error 500: Internal Server Error</title>
    <%@include file="includes/header.jsp"%>
</head>
<div class="container">
    <div class="jumbotron">
        <h1 class="display-5">Internal Server Error</h1>
    </div>
    <div class="container">
        <p class="lead">Something has gone terribly wrong!</p>
        <a href="index.jsp"> Take me home!</a>
    </div>
    <hr>
    <div class="container">
        <h5>Error details:</h5>
        <p>Type: ${pageContext.exception["class"]}</p>
        <p>Message: ${pageContext.exception.message}</p>
<%--        Add full Stack Trace for troubleshooting--%>
        <p>Stack Trace:</p>
        <p>${pageContext.out.flush();pageContext.exception.printStackTrace(pageContext.response.writer)}</p>
    </div>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
<%--<body>--%>
<%--<h1>Internal Server Error</h1>--%>
<%--<h2>Something has gone wrong.</h2>--%>
<%--<h2>Error details:</h2>--%>
<%--<p>Type: ${pageContext.exception["class"]}</p>--%>
<%--<p>Message: ${pageContext.exception.message}</p>--%>
<%--<p>Stack: ${pageContext.exception.stackTrace}</p>--%>

<%--<%@include file="includes/footer.jsp"%>--%>

<%--</body>--%>
</html>
