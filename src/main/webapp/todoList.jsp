<%@ page import="model.Work" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TodoList</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
    }

    input[type="text"] {
        padding: 8px;
        width: 200px;
    }

    button {
        padding: 8px 20px;
        background-color: #5a5aff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    table {
        width: 50%;
        border-collapse: collapse;
        margin-top: 15px;
    }

    th, td {
        border: 1px solid black;
        padding: 10px;
        text-align: center;
    }

    th {
        background-color: #ccc;
    }

    .completed {
        background-color: greenyellow;
        color: white;
    }

    .doing {
        background-color: yellow;
        font-weight: bold;
    }

    .action-button {
        padding: 5px 10px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
</style>

<body>

<form action="WorkServlet" method="post">
    <input type="text" name="workName" placeholder="Enter new job">
    <button type="submit" name="action" value="add">Add</button>
</form>


<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Job Name</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Work> workList = (List<Work>) request.getAttribute("workList");
        for(Work work : workList){
    %>
    <tr class="<%= work.isStatus() ? "completed" : "doing"%>">
        <td><%= work.getId() %></td>
        <td><%= work.getName() %></td>
        <td><%= work.isStatus() ? "Completed" : "Doing"%></td>
        <td>
            <form action="WorkServlet" method="post">
                <input type="hidden" name="workId" value="<%=work.getId()%>" />
                <button type="submit" name="action" value="update" class="action-button">Change Status</button>
            </form>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>

</body>
</html>
