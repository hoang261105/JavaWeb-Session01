<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông báo lỗi</title>
</head>
<body>
<h2 style="color:red;">Đã xảy ra lỗi!</h2>
<p><strong>Chi tiết lỗi:</strong> ${requestScope.errorMessage}</p>
<p>Vui lòng thử lại sau hoặc liên hệ quản trị viên.</p>
</body>
</html>
