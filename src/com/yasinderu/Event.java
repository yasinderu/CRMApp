package com.yasinderu;

import java.util.Scanner;

public class Event {
    private String subject;
    private String description;
    private String name;
    private String startDate;
    private String endDate;

    Scanner in = new Scanner(System.in);

    public Event(String name) {
        this.name = name;
        setSubject();
        setDescription();
        setDate();
    }

    private void setSubject() {
        System.out.print("Subject : ");
        this.subject = in.nextLine();
    }

    private void setDescription() {
        System.out.println("Description : ");
        this.description = in.nextLine();
    }

    private void setDate() {
        System.out.print("Start Date : ");
        this.startDate = in.nextLine();
        System.out.print("End Date : ");
        this.endDate = in.nextLine();
    }

    public void showInfo() {
        System.out.println("Subject : " + subject);
        System.out.println("Description : " + description);
        System.out.println("Start Date : " + startDate);
        System.out.println("End Date : " + endDate);
        System.out.println("Lead Name : " + name);
        System.out.println(" ");
    }
}