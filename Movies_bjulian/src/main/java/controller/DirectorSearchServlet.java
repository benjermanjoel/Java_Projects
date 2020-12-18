package controller;

import dao.MovieDAO;
import dao.MovieDAOException;
import dao.MovieDAOImpl;
import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.WorkbookUtility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "DirectorSearchServlet", urlPatterns = "/searchByDirector")
public class DirectorSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            final MovieDAO movieDAO = new MovieDAOImpl();
            final List<Movie> movies = movieDAO.retrieveMovies();

            String searchString = request.getParameter("director");

//          Lambda expression includes the toLowerCase method in order to allow for non-case sensitive search terms
            final List<Movie> filtered = movies.stream().filter((Movie m) -> m.getDirector()
                    .toLowerCase()
                    .contains(searchString.toLowerCase()))
                    .collect(Collectors.toList());

            request.setAttribute("movies", filtered);

        } catch (MovieDAOException e) {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/view-all.jsp").forward(request,response);
    }
}
