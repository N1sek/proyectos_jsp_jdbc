package org.iesvdm.proyectos_jsp_jdbc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iesvdm.proyectos_jsp_jdbc.dao.UserDAO;
import org.iesvdm.proyectos_jsp_jdbc.dao.UserDAOImpl;
import org.iesvdm.proyectos_jsp_jdbc.model.User;

import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = null;
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional<User> user = userDAO.findByName(username);

        if (user.isPresent() && user.get().getPassword().equals(password)){
            dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/controlAcceso.jsp");
            dispatcher.forward(req, resp);
        }else {
            dispatcher = req.getRequestDispatcher("WEB-INF/jsp/login.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
