package controller;

import dao.PersonDAO;
import dao.PersonDAOException;
import dao.PersonDAOImpl;
import model.Person;
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

@WebServlet(name = "SearchServlet", urlPatterns = "/searchLastName")
public class LastNameSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
//        final File inputFile = new File(filePath);

        try {
//            final List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            final PersonDAO personDAO = new PersonDAOImpl();
            List<Person> people = personDAO.retrievePeople();

            String searchString = request.getParameter("lastName");

            // Create our filtered list using lambda object
            final List<Person> filtered = people.stream().filter((Person p) -> p.getLastName()
                    .equalsIgnoreCase(searchString))
                    .collect(Collectors.toList());

            request.setAttribute("people",filtered);
        } catch (PersonDAOException e) {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/view-all.jsp").forward(request,response);
    }
}
