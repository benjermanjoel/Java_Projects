package controller;

import comparator.DirectorComparator;
import comparator.RuntimeComparator;
import comparator.TitleComparator;
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
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", urlPatterns = "/ViewAll")
public class ViewAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/view-all.jsp";
//        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
//        final File inputFile = new File(filePath);

        try {
//            final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
            // Switch to using the database instead of the spreadsheet
            final MovieDAO movieDAO = new MovieDAOImpl();
            final List<Movie> movies = movieDAO.retrieveMovies();

            String sortType = request.getParameter("sortType");

            if (null != sortType && sortType.equals("title")){
                Collections.sort(movies, new TitleComparator());
            } else if (null != sortType && sortType.equals("director")){
                Collections.sort(movies, new DirectorComparator());
            } else if (null != sortType && sortType.equals("runtime")){
                Collections.sort(movies, new RuntimeComparator());
            }
            request.setAttribute("movies", movies);

        } catch (MovieDAOException e) {
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher(target).forward(request,response);
    }
}
