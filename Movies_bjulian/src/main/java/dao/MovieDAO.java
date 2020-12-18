package dao;

import model.Movie;

import java.util.List;

public interface MovieDAO {
    void populate(String filepath) throws MovieDAOException;
    List<Movie> retrieveMovies() throws MovieDAOException;
    void insertMovie(Movie movie) throws MovieDAOException;
}
