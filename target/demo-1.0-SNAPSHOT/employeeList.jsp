<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>
<table border="1">
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Address</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>${employee.empid}</td>
            <td>${employee.name}</td>
            <td>${employee.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
