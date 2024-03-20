package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/employeeList")
public class EmployeeListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Assuming you have a method to retrieve a single employee by ID
        String employeeId = request.getParameter("id");
        Employee employee = fetchEmployeeByIdFromDatabaseOrOtherSource(employeeId);

        // Set the employee attribute in the request scope
        request.setAttribute("employee", employee);

        // Forward the request to the JSP file
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employeeList.jsp");
        dispatcher.forward(request, response);
    }

    // Method to fetch a single employee by ID (replace this with your actual method)
    private Employee fetchEmployeeByIdFromDatabaseOrOtherSource(String employeeId) {
        // Fetch employee from database or other source based on employeeId
        // Return the Employee object
        return new Employee("1", "John Doe", "123 Main St");
    }
}
