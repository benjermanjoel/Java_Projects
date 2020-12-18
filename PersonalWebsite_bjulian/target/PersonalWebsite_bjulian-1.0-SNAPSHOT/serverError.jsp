<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/2/20
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Internal Server Error</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="main.css">
</head>
<body>
<h2>Something has gone wrong.</h2>
<h1>Error details:</h1>
<p>Type: ${pageContext.exception["class"]}</p>
<p>Message: ${pageContext.exception.message}</p>
<p>Return <a href="index.jsp">Home.</a></p>
<p><a href="contact.jsp">Connect with me!</a></p>
<p>Visit my <a href="bio.jsp">bio page.</a></p>
</body>
</html>
