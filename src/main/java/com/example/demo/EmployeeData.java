package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeData {

    public static ArrayList<HashMap<String, String>> getEmployees() {
        // Replace with your database connection and query logic
        ArrayList<HashMap<String, String>> employees = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> emp1 = new HashMap<String, String>();
        emp1.put("id", "101");
        emp1.put("name", "Alice");
        emp1.put("department", "Marketing");
        emp1.put("salary", "50000");
        employees.add(emp1);

        HashMap<String, String> emp2 = new HashMap<String, String>();
        emp2.put("id", "102");
        emp2.put("name", "Bob");
        emp2.put("department", "Engineering");
        emp2.put("salary", "65000");
        employees.add(emp2);

        return employees;
    }
}
