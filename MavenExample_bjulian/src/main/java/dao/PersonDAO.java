package dao;

import model.Person;

import java.util.List;

public interface PersonDAO {
    void populate(String filepath) throws PersonDAOException;

    List<Person> retrievePeople() throws PersonDAOException;

    void insertPerson(Person person) throws PersonDAOException;
}
