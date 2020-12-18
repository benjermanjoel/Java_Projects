package controller;

import comparator.AgeComparator;
import comparator.FavoriteColorComparator;
import comparator.FirstNameComparator;
import comparator.LastNameComparator;
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
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", urlPatterns = "/ViewAll")
public class ViewAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/view-all.jsp";
        // get access to our spreadsheet file
//        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
//        final File inputFile = new File(filePath);

        // fetch the info and use it to populate the model
        try {
//            final List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            final PersonDAO personDAO = new PersonDAOImpl();
            final List<Person> people = personDAO.retrievePeople();

            String sortType = request.getParameter("sortType");


            if (null != sortType && sortType.equals("lastName")){
                Collections.sort(people, new LastNameComparator());
            } else if (null != sortType && sortType.equals("age")){
                Collections.sort(people, new AgeComparator());
            } else if (null != sortType && sortType.equals("firstName")){
                Collections.sort(people, new FirstNameComparator());
            } else if (null != sortType && sortType.equals("favoriteColor")){
                Collections.sort(people, new FavoriteColorComparator());
            }
            // attach model to the request
            request.setAttribute("people", people);

        } catch ( PersonDAOException e) {
            e.printStackTrace();
        }

        // forward request to the view JSP.
        getServletContext().getRequestDispatcher(target).forward(request,response);
    }
}
