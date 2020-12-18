package dao;

import model.Person;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.DBUtility;
import utility.WorkbookUtility;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    final static String DROP_TABLE = "drop table if exists person";
    final static String CREATE_TABLE = "create table person(id integer primary key autoincrement, first_name text, " +
            "last_name text, age integer, favorite_color text);";
    final static String SELECT_ALL = "select * from person;";

    @Override
    public void populate(String filepath) throws PersonDAOException {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtility.createConnection();
            statement = connection.createStatement();
            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate(DROP_TABLE);
            statement.executeUpdate(CREATE_TABLE);

            //populate the database
            final File inputFile = new File(filepath);
            final List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            for (final Person person : people){
                final String insertValues = "insert into person (first_name,last_name,age,favorite_color) " +
                        "values('"+person.getFirstName()+"','"
                        +person.getLastName()+"',"
                        +person.getAge()+",'"
                        +person.getFavoriteColor()+"');";

                System.out.println(insertValues);

                statement.executeUpdate(insertValues);
            }

        } catch (SQLException | ClassNotFoundException | InvalidFormatException | IOException exception) {
            exception.printStackTrace();
            throw new PersonDAOException("Error: Unable to populate the database.");
        }
    }

    @Override
    public List<Person> retrievePeople() throws PersonDAOException {
        final List<Person> people = new ArrayList<Person>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtility.createConnection();
            statement = connection.createStatement();
            statement.setQueryTimeout(DBUtility.TIMEOUT);

            // select all from table
            final ResultSet results = statement.executeQuery(SELECT_ALL);

            // loop
            while (results.next()) {
                final String firstName = results.getString("first_name");
                final String lastName = results.getString("last_name");
                final int age = results.getInt("age");
                final String favoriteColor = results.getString("favorite_color");

                people.add(new Person(firstName, lastName, age, favoriteColor));
            }

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
            throw new PersonDAOException("Error: Unable to retrieve list of people.");
        }
        return people;
    }

    @Override
    public void insertPerson(Person person) throws PersonDAOException {
        Connection connection = null;
        PreparedStatement insertStatement = null;

        try {
            connection = DBUtility.createConnection();

            final String sqlString = "insert into person (first_name,last_name,age,favorite_color) values(?,?,?,?);";
            insertStatement = connection.prepareStatement(sqlString);
            insertStatement.setString(1, person.getFirstName());
            insertStatement.setString(2, person.getLastName());
            insertStatement.setInt(3, person.getAge());
            insertStatement.setString(4, person.getFavoriteColor());

            insertStatement.setQueryTimeout(DBUtility.TIMEOUT);

            insertStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
            throw new PersonDAOException("Error: unable to insert person.");
        }
    }
}
