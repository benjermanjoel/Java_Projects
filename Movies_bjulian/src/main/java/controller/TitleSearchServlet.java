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

@WebServlet(name = "TitleSearchServlet", urlPatterns = "/searchByTitle")
public class TitleSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
//        final File inputFile = new File(filePath);

        try {
//            final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
            // Switch to using the database instead of the spreadsheet
            final MovieDAO movieDAO = new MovieDAOImpl();
            final List<Movie> movies = movieDAO.retrieveMovies();

            String searchString = request.getParameter("title");

            final List<Movie> filtered = movies.stream().filter((Movie m) -> m.getTitle()
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
