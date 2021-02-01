package ru.geekbrains;

import ru.geekbrains.persist.User;
import ru.geekbrains.persist.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/users")
public class UserListServlet extends HttpServlet {

    private UserRepository userRepository;

    @Override
    public void init() throws ServletException {

        this.userRepository = (UserRepository) getServletContext().getAttribute("userRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter wr = resp.getWriter();
        wr.println("<table>");

        wr.println("<tr>");
        wr.println("<th>id</th>");
        wr.println("<th>UserName</th>");
        wr.println("</tr>");

        for (User user : userRepository.findAll()
        ) {
            wr.println("<tr>");
            wr.println("<td>" + user.getId() + "</td>");
            wr.println("<td><a href='" + getServletContext().getContextPath() + "/user/" + user.getId() + "'>" + user.getUserName() + "</a></td>");
            wr.println("</tr>");

        }

        wr.println("</table>");


    }
}
