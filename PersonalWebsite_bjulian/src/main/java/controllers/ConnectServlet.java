package controllers;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "connect", urlPatterns = "/connect")
public class ConnectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/thanks.jsp";

        final String firstName = request.getParameter("firstName");
        final String lastName = request.getParameter("lastName");
        final String email = request.getParameter("email");

        if(firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty() && email != null && !email.isEmpty()){
            // form filled out
            final User user = new User(firstName,lastName,email);
            // TODO add user to database
            request.setAttribute("user", user);
        } else{
            target="/contact.jsp";
            request.setAttribute("message", "Please complete all fields in the below form");
        }

        getServletContext().getRequestDispatcher(target).forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
