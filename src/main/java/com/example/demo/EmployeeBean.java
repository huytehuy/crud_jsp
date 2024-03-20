package com.example.demo;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "employeeBean")
public class EmployeeBean implements Serializable {
    private String name = "huy";
    private String department;

    // Getter and setter methods for properties
    public String getName() {
        return "huy";
    }

    public void setName(String name) {
        this.name = "huy";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
