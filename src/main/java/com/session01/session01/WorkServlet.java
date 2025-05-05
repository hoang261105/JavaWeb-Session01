package com.session01.session01;import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Work;

@WebServlet(name = "WorkServlet", value = "/WorkServlet")
public class WorkServlet extends HttpServlet {
    private List<Work> workList = new ArrayList<>();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            addWork(request, response);
        } else if ("update".equals(action)) {
            updateWorkStatus(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("workList", workList);
        request.getRequestDispatcher("todoList.jsp").forward(request, response);
    }

    private void addWork(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String workName = request.getParameter("workName");

        Work work = new Work(workName);
        workList.add(work);

        request.setAttribute("workList", workList);
        request.getRequestDispatcher("todoList.jsp").forward(request, response);
    }

    private void updateWorkStatus(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int workId = Integer.parseInt(request.getParameter("workId"));

        for(Work work : workList) {
            if(work.getId() == workId) {
                work.setStatus(!work.isStatus());
                break;
            }
        }

        request.setAttribute("workList", workList);
        request.getRequestDispatcher("todoList.jsp").forward(request, response);
    }
}