package controller;

import dao.MovieDAO;
import dao.MovieDAOException;
import dao.MovieDAOImpl;
import utility.WorkbookUtility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PopulateDBServlet", urlPatterns = "/populateDB")
public class PopulateDBServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
        final MovieDAO movieDAO = new MovieDAOImpl();
        String message = "";

        try {
            movieDAO.populate(filePath);
            message = "Database successfully populated!";
        } catch (MovieDAOException e) {
            e.printStackTrace();
            message = "There was an error creating the database. The database has not been populated.";
        }
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/populateDB.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        doPost(request, response);
    }
}
