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
    <title>Add New Batman Movie</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="jumbotron">
        <h1 class="display-4">Add New Batman Movie</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div>
        <p class="lead">Use the below form to add a new movie to the Batman Film Database</p>
    </div>
    <h3 style="color: #c82333">${message}</h3>
<%-- Form for adding a new movie. Required fields per the Final Project specifications are title, director and runtime.--%>
    <div class="container">
        <form action="addMovie" method="post">

                    <label for="title">Title:</label>
                    <input type="text" class="form-control" name="title" id="title" aria-describedby="titleHelp"
                           placeholder="eg. The Dark Knight" required>
                    <small id="titleHelp" class="form-text text-muted">
                        Required
                    </small>

                    <label for="director">Director:</label>
                    <input type="text" class="form-control" name="director" id="director" aria-describedby="directorHelp"
                           placeholder="eg. Christopher Nolan" required>
                    <small id="directorHelp" class="form-text text-muted">
                        Required
                    </small>


                    <label for="runtime">Film Runtime in Minutes:</label>
                    <input type="text" class="form-control" name="runtime" id="runtime" aria-describedby="runtimeHelp"
                           placeholder="eg. 120" required>
                    <small id="runtimeHelp" class="form-text text-muted">
                        Required
                    </small>

                    <label for="imdbLink">IMDB Link:</label>
                    <input type="text" class="form-control" name="imdbLink" id="imdbLink" aria-describedby="linkHelp"
                    placeholder="eg. https://www.imdb.com/title/tt0468569/">
                    <small id="linkHelp" class="form-text text-muted">
                        Optional
                    </small>
            <br>
            <button type="submit" class="btn btn-secondary">Submit</button>
        </form>
    </div>

<%@include file="includes/footer.jsp"%>
</div>
</body>
</html>
