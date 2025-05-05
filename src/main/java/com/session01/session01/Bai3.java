package com.session01.session01;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Bai3", value = "/Bai3")
public class Bai3 extends HttpServlet {
    private String name;
    private int age;

    public void init() {
        name = "Hoàng";
        age = 18;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3> Tên: " + name + "</h3>");
        out.println("<p> Tuổi: " + age + "</p>");
        out.println("</body></html>");
    }
}