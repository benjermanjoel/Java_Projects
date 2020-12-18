<%--
  Created by IntelliJ IDEA.
  User: ben.julian
  Date: 11/17/20
  Time: 7:42 AM
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
        <h1 class="display-4">Batman Film Search: By Title</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>

    <div class="container">
                <form action="searchByTitle" method="get">
                <label for="title">Search by Title</label>
                <input type="text" name="title" class="form-control" id="title" aria-describedby="searchHelp">
                    <small id="searchHelp" class="form-text text-muted">
                        Search by partial or full name keywords, wildcard searching is not supported.
                    </small>
                    <button type="submit" class="btn btn-secondary">Search</button>
                </form>
    </div>

<%--    <form>--%>
<%--        <div class="form-actions">--%>
<%--            <label for="title">Search by Title</label>--%>
<%--            <input type="text" class="form-control" id="title" aria-describedby="searchHelp">--%>
<%--            <small id="searchHelp" class="form-text text-muted">Search by full or partial title keywords only. Wildcard searching is--%>
<%--                not supported.--%>
<%--            </small>--%>
<%--        </div>--%>
<%--        <button type="submit" class="btn btn-primary">Search</button>--%>
<%--    </form>--%>


    <%@include file="includes/footer.jsp"%>
</div>
</body>
</html>
