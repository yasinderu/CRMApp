package com.yasinderu;

import java.util.Scanner;

public class User {
    private String name;
    private String department;

    Scanner in = new Scanner(System.in);

    public User() {
        setName();
        setDepartment();
    }

    private void setName() {
        System.out.print("Fullname : ");
        this.name = in.nextLine();
    }

    private void setDepartment() {
        System.out.print("Department : ");
        this.department = in.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void showDetail() {
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
    }
}