
<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/11/20
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Batman Movie Warehouse</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <h1 class="display-4">View All Batman Movies</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div class="container">
        <c:choose>
            <c:when test="${empty movies}">
                <p>Sorry, the list of movies was empty.</p>
            </c:when>
            <c:otherwise>
                <c:forEach var="movie" items="${movies}">
<%--                For each movie, I've used a card object to display the data. My intention here was to
                    also populate images as well. Storing the image filename in the database and the image itself in
                    the assets folder, to mimic a user uploading an image file to the webapp I'm convinced this should
                    work somehow but I'm unable to populate them via a standard img src tag. So I didn't move forward with it.
                     --%>
                    <div class="card">
<%--                        <img src="${pageContext.request.contextPath}${movie.imgSRC}" class="card-img-top" alt="...">--%>
                        <div class="card-body">
                            <h5 class="card-header">${movie.title}</h5>
                            <br>
                            <p class="card-text">Director: ${movie.director}</p>
                            <p class="card-text">Runtime: ${movie.lengthInMinutes} minutes.</p>
                            <a href="${movie.imdbLink}" class="btn btn-primary">View on IMDB</a>
                        </div>
                    </div>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </div>


    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
