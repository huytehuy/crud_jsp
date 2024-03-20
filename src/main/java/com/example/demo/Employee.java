package com.example.demo;

public class Employee {
    private String empid;
    private String name;
    private String address;

    // Constructors

    public Employee() {
        // Default constructor
    }

    public Employee(String id, String name, String address) {
        this.empid = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return '['+empid+','  + name+',' + address+']';
    }

    // Getter and Setter methods

    public String getId() {
        return empid;
    }

    public void setId(String id) {
        this.empid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
