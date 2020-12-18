<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/10/20
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Java Web Programming: Class List</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="hero-unit">
            <h1>Class List</h1>
        </div>
    
        <%@include file="includes/navigation.jsp"%>

        <div class="container">
            <c:choose>
                <c:when test="${empty people}">
                    <p>Sorry, the list of persons was empty.</p>
                </c:when>
                <c:otherwise>
                    <c:forEach var="person" items="${people}">
                        <h2>${person.lastName}, ${person.firstName}</h2>
                        <p>Age: ${person.age}</p>
                        <p>Favorite Color: ${person.favoriteColor}</p>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </div>
    
        <%@include file="includes/footer.jsp"%>
    
    </div>

</body>
</html>
