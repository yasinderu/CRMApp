package com.yasinderu;

import java.util.Scanner;

public class Task {
    private String subject;
    private String dueDate;
    private String name;

    Scanner in = new Scanner(System.in);

    public Task(String name) {
        this.name = name;
        setSubject();
        setDueDate();
    }

    private void setSubject() {
        System.out.println("Enter task subject : ");
        this.subject = in.nextLine();
    }

    private void setDueDate() {
        System.out.println("Enter task due date : ");
        this.dueDate = in.nextLine();
    }

    public void showInfo() {
        System.out.println("Subject : " + subject);
        System.out.println("Due Date : " + dueDate);
        System.out.println("Lead Name : " + name);
        System.out.println(" ");
    }
}