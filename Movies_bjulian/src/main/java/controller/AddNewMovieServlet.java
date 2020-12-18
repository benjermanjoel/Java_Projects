package controller;

import com.google.common.base.Strings;
import dao.MovieDAO;
import dao.MovieDAOException;
import dao.MovieDAOImpl;
import model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddNewMovieServlet", urlPatterns = "/addMovie")
public class AddNewMovieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String title = request.getParameter("title");
        final String director = request.getParameter("director");
        final String runtimeString = request.getParameter("runtime");
        final String imdbLink = request.getParameter("imdbLink");


        if (Strings.isNullOrEmpty(title)
        || Strings.isNullOrEmpty(director)
        || Strings.isNullOrEmpty(runtimeString)){
            // one of the above was null or empty
            request.setAttribute("message", "Please complete all required fields");
        }
        else {
            // all required fields entered
            final int runtime = Integer.parseInt(runtimeString);
            final MovieDAO movieDAO = new MovieDAOImpl();
            final Movie movie = new Movie(title,director,runtime,imdbLink);

            try {
                movieDAO.insertMovie(movie);
                request.setAttribute("message", "A new Batman movie has been added successfully!");

            } catch (MovieDAOException exception) {
                exception.printStackTrace();
                request.setAttribute("message", exception.getMessage());
            }
            getServletContext().getRequestDispatcher("/addMovie.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
