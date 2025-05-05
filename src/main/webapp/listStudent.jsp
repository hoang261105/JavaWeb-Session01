<%@ page import="model.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Danh sách sinh viên đăng ký xe</h2>
    <table border="1" cellpadding="10">
        <tr>
            <th>Họ và tên</th>
            <th>Lớp</th>
            <th>Loại xe</th>
            <th>Bien số xe</th>
        </tr>
        <%
            List<Student> studentList = (List<Student>) request.getAttribute("studentList");
            for (Student s : studentList) {
        %>
        <tr>
            <td><%= s.getFullName() %></td>
            <td><%= s.getClassName() %></td>
            <td><%= s.getVehicleType() %></td>
            <td><%= s.getPlateNumber() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
