package controller;

import com.google.common.base.Strings;
import dao.PersonDAO;
import dao.PersonDAOException;
import dao.PersonDAOImpl;
import model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddNewServlet", urlPatterns = "/AddNewPerson")
public class AddNewPersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        try {
            final String firstname = request.getParameter("firstName");
            final String lastname = request.getParameter("lastName");
            final String ageString = request.getParameter("age");
            final String favoriteColor = request.getParameter("favoriteColor");

            if (Strings.isNullOrEmpty(firstname)
            || Strings.isNullOrEmpty(lastname)
            || Strings.isNullOrEmpty(ageString)
            || Strings.isNullOrEmpty(favoriteColor)){
                // one of the above was null or empty
                request.setAttribute("message", "Please complete all fields.");
            }
            else {
                //all good
                final int age = Integer.parseInt(ageString);
                final PersonDAO personDAO = new PersonDAOImpl();
                final Person person = new Person(firstname,lastname,age,favoriteColor);

                personDAO.insertPerson(person);
                request.setAttribute("message", "New person added successfully!");

            }

        } catch (PersonDAOException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
        }
        getServletContext().getRequestDispatcher("/add-person.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        doPost(request, response);
    }
}
