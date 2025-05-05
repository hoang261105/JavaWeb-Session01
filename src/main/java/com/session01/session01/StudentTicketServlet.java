package com.session01.session01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Student;

@WebServlet(name = "StudentTicketServlet", value = "/StudentTicketServlet")
public class StudentTicketServlet extends HttpServlet {
    private static List<Student> studentList = new ArrayList<>();

    public void init() {
        studentList.add(new Student("Nguyễn Văn A", "12A1", "Xe máy", "59X1-123.45"));
        studentList.add(new Student("Trần Thị B", "12A2", "Xe đạp", "Không có"));
        studentList.add(new Student("Lê Văn C", "12B3", "Xe máy", "51Y2-789.01"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("studentList", studentList);
        request.getRequestDispatcher("/listStudent.jsp").forward(request, response);
    }
}