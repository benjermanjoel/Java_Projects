<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="index.jsp">
        <img src="assets/Batman.png" width="30" height="30" class="d-inline-block align-top" loading="lazy">
        Home
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>



    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="populateDB.jsp">Populate Batman Film Database</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="addMovie.jsp">Add New Movie</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="sort" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    View All Movies
                </a>
                <div class="dropdown-menu" aria-labelledby="sort">
                    <a class="dropdown-item" href="ViewAll">Unsorted</a>
                    <a class="dropdown-item" href="ViewAll?sortType=title">By Title</a>
                    <a class="dropdown-item" href="ViewAll?sortType=director">By Director</a>
                    <a class="dropdown-item" href="ViewAll?sortType=runtime">By Runtime</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="search" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Search Movies
                </a>
                <div class="dropdown-menu" aria-labelledby="search">
                    <a class="dropdown-item" href="searchByTitle.jsp">Search by Title</a>
                    <a class="dropdown-item" href="searchByDirector.jsp">Search by Director</a>
                </div>
            </li>
        </ul>
    </div>
</nav>