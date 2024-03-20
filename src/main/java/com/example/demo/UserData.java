package com.example.demo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="userData")
@RequestScoped
public class UserData {
    private String name ;
    private int age;
    public UserData() {
        // Sample data initialization
        this.name = "John Doe";
        this.age = 30;
    }
    public static String hello() {
        return "Hello from MyUtils!";
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
