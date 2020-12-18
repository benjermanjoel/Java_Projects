<ul class="nav nav-tabs">
    <li><a href="index.jsp">Home</a></li>
    <li><a href="populateDB.jsp">Populate Class Roster</a></li>
    <li><a href="add-person.jsp">Add New Student</a></li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">View All<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="ViewAll">Unsorted</a></li>
            <li><a href="ViewAll?sortType=lastName">By Last Name</a></li>
            <li><a href="ViewAll?sortType=firstName">By First name</a></li>
            <li><a href="ViewAll?sortType=age">By Age</a></li>
            <li><a href="ViewAll?sortType=favoriteColor">By Favorite Color</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Search<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="searchLastName.jsp">Search by last name</a></li>
            <li><a href="searchFirstName.jsp">Search by first name</a></li>
        </ul>
    </li>

</ul>