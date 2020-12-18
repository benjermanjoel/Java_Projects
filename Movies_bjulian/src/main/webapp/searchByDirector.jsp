<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/17/20
  Time: 7:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="jumbotron">
        <h1 class="display-4">Batman Film Search: By Director</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>


    <div class="container">
        <form action="searchByDirector" method="get">
            <label for="director">Search by Director</label>
            <input type="text" class="form-control" name="director" id="director" aria-describedby="searchHelp">
            <small id="searchHelp" class="form-text text-muted">
                Search by partial or full name keywords, wildcard searching is not supported.
            </small>
            <button type="submit" class="btn btn-secondary">Search</button>
        </form>
    </div>

    <%@include file="includes/footer.jsp"%>

</div>
</body>
</html>
