<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/3/20
  Time: 7:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connect with me!</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="main.css">
</head>
<body>
<h1>Please fill out the below form with your contact information</h1>

<h2 style="color: red">${message}</h2>

<form action="connect" method="post">
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName"><br>

    <label for="lastName">Last Name:</label>
    <input type="text" name="lastName" id="lastName"><br>

    <label for="email">Email:</label>
    <input type="text" name="email" id="email"><br>

    <input type="submit">
</form>
<p>Return <a href="index.jsp">Home.</a></p>
<p>Visit my <a href="bio.jsp">bio page.</a></p>
</body>
</html>
