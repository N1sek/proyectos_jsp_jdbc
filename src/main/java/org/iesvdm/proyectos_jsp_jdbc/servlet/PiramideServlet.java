package org.iesvdm.proyectos_jsp_jdbc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PiramideServlet", value = "/PiramideServlet")
public class PiramideServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/alturaPiramide.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = null;

        Integer altura = Integer.parseInt(req.getParameter("altura"));

        if (altura>0){
            req.setAttribute("altura", altura);
            dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/piramideMichis.jsp");
            dispatcher.forward(req, resp);
        }else{
            req.setAttribute("error", "La altura debe ser mayor a 0");
            dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/alturaPiramide.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
