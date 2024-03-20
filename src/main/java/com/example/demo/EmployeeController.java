package com.example.demo;


import java.sql.Connection;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        DBFunction db=new DBFunction();
        Connection conn=db.connect_to_db("postgres","postgres","huyhuy");
//        db.createTable(conn,"employee");
//        db.insert_row(conn,"employee","hieu","VietNam");
        //db.update_name(conn,"employee","Rahul","Raj");
//        db.search_by_name(conn,"employee","huy");
//        db.delete_row_by_name(conn,"employee","hieu");
        //db.delete_row_by_id(conn,"employee",4);
        db.read_data(conn,"employee");
//        db.delete_table(conn,"NhanVien");
        // write your code here
    }

    public static List<Employee> ShowEmployee() {
        DBFunction db=new DBFunction();
        Connection conn=db.connect_to_db("postgres","postgres","huyhuy");
        return db.read_data(conn,"employee");
    }

    public static void addEmployee(String name,String address) {
        DBFunction db=new DBFunction();
        Connection conn=db.connect_to_db("postgres","postgres","huyhuy");
        db.insert_row(conn,"employee",name,address);
    }
    public static void deleteEmployee(String id) {
        DBFunction db=new DBFunction();
        Connection conn=db.connect_to_db("postgres","postgres","huyhuy");
        db.delete_row_by_id(conn,"employee",id);
    }
    public static void updateEmployee(String id) {
        DBFunction db=new DBFunction();
        Connection conn=db.connect_to_db("postgres","postgres","huyhuy");
        db.update_name(conn,"employee","Rahul","Raj");
    }



 }

//package com.example.demo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    // Simulated database storing employee details
//    private static final Map<String, String[]> employeeDetails = new HashMap<>();
//
//    static {
//        // Populate employeeDetails with sample data
//        employeeDetails.put("1", new String[]{"1", "John Doe", "123 Main St"});
//        employeeDetails.put("2", new String[]{"2", "Jane Smith", "456 Oak Ave"});
//        employeeDetails.put("3", new String[]{"3", "Mike Johnson", "789 Elm St"});
//        employeeDetails.put("4", new String[]{"4", "Emily Davis", "101 Maple Rd"});
//    }
//
//    public static String[] getEmployeeDetails(String employeeId) {
//        // Retrieve employee details by ID from the database (simulated)
//        return employeeDetails.get(employeeId);
//    }
//
//    public static String[] start() {
//        return new String[]{"1", "2", "3", "4"};
//    }
//}

///////////////////////
//package com.example.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    private static final String DB_URL = "jdbc:postgresql://localhost:5433/postgres";
//    private static final String DB_USER = "postgres";
//    private static final String DB_PASSWORD = "huyhuy";
//
//    public static List<String[]> start() {
//        List<String[]> employeeIds = new ArrayList<>();
//        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employee");
//             ResultSet rs = stmt.executeQuery()) {
//
//            while (rs.next()) {
//                String id = rs.getString("name");
//                System.out.println(1+id);
//                employeeIds.add(new String[]{id});
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employeeIds;
//    }
//
//    public static String[] getEmployeeDetails(String employeeId) {
//        String[] employeeDetails = new String[3]; // Change the size according to your data
//        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employee WHERE id = ?")) {
//
//            stmt.setString(1, employeeId);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                employeeDetails[0] = rs.getString("id");
//                employeeDetails[1] = rs.getString("name");
//                employeeDetails[2] = rs.getString("address");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employeeDetails;
//    }
//}
//
//

