<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/23/20
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Web Programming: Add New Person</title>
    <%@include file="includes/header.jsp"%></head>
<body>
<div class="container">
    <div class="hero-unit">
        <h1>Add New Student</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div>
        <p class="lead">Use the below form to add a new student to the class roster.</p>
    </div>

    <div class="container">
        <form action="AddNewPerson" method="post">
            <label for="firstName">First Name:</label>
            <input type="text" name="firstName" id="firstName">

            <label for="lastName">Last Name:</label>
            <input type="text" name="lastName" id="lastname">

            <label for="age">Age:</label>
            <input type="text" name="age" id="age">

            <label for="favoriteColor">Favorite Color:</label>
            <input type="text" name="favoriteColor" id="favoriteColor">

            <input type="submit">
        </form>
    </div>
    <h3 style="color: #c82333">${message}</h3>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
