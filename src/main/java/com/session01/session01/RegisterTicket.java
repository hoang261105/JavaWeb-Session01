package com.session01.session01;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "RegisterTicket", value = "/register-ticket")
public class RegisterTicket extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handleRegister(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("register.html");
    }

    private void handleRegister(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String fullName = request.getParameter("fullName");
        String className = request.getParameter("className");
        String vehicleType = request.getParameter("vehicleType");
        String plateNumber = request.getParameter("plateNumber");

        request.setAttribute("fullName", fullName);
        request.setAttribute("className", className);
        request.setAttribute("vehicleType", vehicleType);
        request.setAttribute("plateNumber", plateNumber);

        request.getRequestDispatcher("/resultRegister.jsp").forward(request, response);
    }
}