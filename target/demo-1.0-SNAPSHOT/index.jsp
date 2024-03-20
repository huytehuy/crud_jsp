
<%--<%@ page import="com.example.demo.UserData" %>--%>
<%--<%@ page import="com.example.demo.Main" %>--%>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Employee List</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Employee List</h1>--%>
<%--<table border="1">--%>
<%--    <tr>--%>
<%--        <th>Employee ID</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Address</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="employee" items="${Main.start()}">--%>
<%--        <tr>--%>
<%--            <td>${Main.start()}</td>--%>
<%--            <td>${employee.name}</td>--%>
<%--            <td>${employee.address}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page import="com.example.demo.EmployeeController" %>
<%@ page import="com.example.demo.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <style>
        /* Add your modal CSS styles here */
        .modal {
            display: none;
            /* Add other CSS properties for your modal */
        }
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<h1>Employee List</h1>
<div id="addEmployeeForm" >
    <!-- Your form fields go here -->
    <!-- Form fields for employee data -->
    <form action="AddEmployeeServlet" method="post">
        <input type="text" name="name" placeholder="Name">
        <input type="text" name="address" placeholder="Address">
        <button type="submit">Add Employee</button>
    </form>
</div>
<%--<button onclick=<%= Main.addEmployee() %>>Add employee</button></td>--%>
<table border="1">
    <tr>
        <th style="width: 40px">ID</th>
        <th style="width: 100px">Name</th>
        <th style="width: 100px">Address</th>
        <th style="width: 40px">Edit</th>
        <th style="width: 40px">Remove</th>

    </tr>
    <% for (Employee employee : EmployeeController.ShowEmployee()) { %>
    <tr>
        <td><%= employee.getId() %></td>
        <td><%= employee.getName() %></td>
        <td><%= employee.getAddress() %></td>
        <td><button onclick="toggleAddEmployeeForm()"><i class="fas fa-edit"></i></button></td>
        <td>
            <form id="deleteForm_<%= employee.getId() %>" action="DeleteEmployeeServlet" method="post">
                <input type="hidden" name="id" value="<%= employee.getId() %>">
                <button type="button" onclick="deleteEmployee('<%= employee.getName() %>', '<%= employee.getId() %>')">&#10006;</button>
            </form>
        </td>
    </tr>
    <% } %>
</table>
<div id="myModal" class="modal" style="display: none">
    <!-- Modal content -->
    <div class="modal-content">
        <span class="close" onclick="closeModal()">&times;</span>
        <p id="modalContent"></p>
    </div>
</div>



<script>
    // JavaScript function to show the modal
    function showModal(employeeName) {
        var modal = document.getElementById("myModal");
        var modalContent = document.getElementById("modalContent");
        modal.style.display = "block";
        modalContent.innerHTML = "Employee: " + employeeName;
    }

    // JavaScript function to close the modal
    function closeModal() {
        var modal = document.getElementById("myModal");
        modal.style.display = "none";
    }
    function deleteEmployee(employeeName, employeeId) {
        var confirmation = confirm("Are you sure you want to delete ID=" + employeeId + "?");
        if (confirmation) {
            var form = document.getElementById("deleteForm_" + employeeId);
            form.submit();
        }
    }

</script>
</body>
</html>



