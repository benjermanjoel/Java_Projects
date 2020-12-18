package dao;

import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.DBUtility;
import utility.WorkbookUtility;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOImpl implements MovieDAO{

    // Database actions.
    // Per Final Project Specifications the table is to be called "movie"
    final static String DROP_TABLE = "drop table if exists movie";
    final static String CREATE_TABLE = "create table movie(id integer primary key autoincrement, title text, " +
            "director text, runtime_minutes integer, imdb_link text);";
    final static String SELECT_ALL = "select * from movie;";

    @Override
    // The populate method is used to create the database, the movies table, and insert data from the
    // 'BatmanMovieList' spreadsheet
    public void populate(String filepath) throws MovieDAOException {
        Connection connection = null;
        Statement statement = null;

        try {
            // create the db and table
            connection = DBUtility.createConnection();
            statement = connection.createStatement();
            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate(DROP_TABLE);
            statement.executeUpdate(CREATE_TABLE);

            //populate the batman_movies.movies table with data
            final File inputFile = new File(filepath);
            final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);

            for (final Movie movie : movies){
                final String insertValues = "insert into movie (title,director,runtime_minutes,imdb_link) values" +
                        "('"+movie.getTitle()+"','"
                        +movie.getDirector()+"','"
                        +movie.getLengthInMinutes()+"','"
                        +movie.getImdbLink()+"')";

                // debugging
                System.out.println(insertValues);
                statement.executeUpdate(insertValues);
            }

        } catch (SQLException | ClassNotFoundException | InvalidFormatException | IOException exception ) {
            exception.printStackTrace();
            throw new MovieDAOException("Error: Unable to populate the movie table with data from spreadsheet.");
        }
    }

    @Override
    public List<Movie> retrieveMovies() throws MovieDAOException {
        final List<Movie> movies = new ArrayList<Movie>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtility.createConnection();
            statement = connection.createStatement();
            statement.setQueryTimeout(DBUtility.TIMEOUT);

            // select all data from movies table
            final ResultSet results = statement.executeQuery(SELECT_ALL);
            // loop
            while (results.next()){
                final String title = results.getString("title");
                final String director = results.getString("director");
                final int runtime = results.getInt("runtime_minutes");
                final String imdbLink = results.getString("imdb_link");

                movies.add(new Movie(title,director,runtime,imdbLink));
            }

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
            throw new MovieDAOException("Error: unable to retrieve movie records from movie table.");
        }
        return movies;
    }

    @Override
    public void insertMovie(Movie movie) throws MovieDAOException {
        Connection connection = null;
        PreparedStatement insertStatement = null;

        try {
            connection = DBUtility.createConnection();
            final String sqlString = "insert into movie (title,director,runtime_minutes,imdb_link) values(?,?,?,?);";

            // Insert a new record into movies table using our prepared statement
            insertStatement = connection.prepareStatement(sqlString);
            insertStatement.setString(1, movie.getTitle());
            insertStatement.setString(2, movie.getDirector());
            insertStatement.setInt(3,movie.getLengthInMinutes());
            insertStatement.setString(4, movie.getImdbLink());
            insertStatement.setQueryTimeout(DBUtility.TIMEOUT);
            insertStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
            throw new MovieDAOException("Error: unable to insert movie record to movie table.");
        }

    }
}
