<hr>
<div class="container">
    <div class="container-fluid">
        <p>
            <small class="text-muted">&copy; Copyright 2020 - Benjamin Julian <br>
                All rights are reserved by Warner Bros. Entertainment. <br>
                The DC logo and all DC characters and related elements &copy; & TM DC.</small>
        </p>
    </div>
</div>
<hr>

<%--I added a more customized footer object.--%>
<ul class="nav justify-content-center">
    <li class="nav-item">
        <a class="nav-link" href="index.jsp" style="color: #4e555b">Return Home</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="populateDB.jsp" style="color: #4e555b">Populate Database</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="addMovie.jsp" style="color: #4e555b">Add New Movie</a>
    </li>
    <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" style="color: #4e555b" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
           aria-expanded="false">View All Batman Movies</a>
        <div class="dropdown-menu">
            <a class="dropdown-item" href="ViewAll" style="color: #4e555b">Unsorted</a>
            <a class="dropdown-item" href="ViewAll?sortType=title" style="color: #4e555b">By Title</a>
            <a class="dropdown-item" href="ViewAll?sortType=director" style="color: #4e555b">By Director</a>
            <a class="dropdown-item" href="ViewAll?sortType=runtime" style="color: #4e555b">By Runtime</a>
        </div>
    </li>
    <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" style="color: #4e555b" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
           aria-expanded="false">Search Movies</a>
        <div class="dropdown-menu">
            <a class="dropdown-item" href="searchByTitle.jsp" style="color: #4e555b">Search by Title</a>
            <a class="dropdown-item" href="searchByDirector.jsp" style="color: #4e555b">Search by Director</a>
        </div>
    </li>
</ul>