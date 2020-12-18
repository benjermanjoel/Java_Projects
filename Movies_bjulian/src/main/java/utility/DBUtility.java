package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {
    public static final int TIMEOUT = 30;
    private static final String CONNECTION = "jdbc:sqlite:batman_movies.db";
    private static final String DRIVER = "org.sqlite.JDBC";

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        //register
        Class.forName(DRIVER);
        //create database connection, this also creates the database
        return DriverManager.getConnection(CONNECTION);
    }

    public static void closeConnection(final Connection connection, final Statement statement){

        try {
            if(null != connection){
                connection.close();
            }
            if (null != statement){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
