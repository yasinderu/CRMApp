package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lead {
    private static int id = 1000;
    private static String leadId;
    public String firstName;
    public String lastName;
    private String fullName;
    private String companyName;
    private String phoneNumber;
    private String email;
    private String leadStatus;

    private List<Task> task;
    private List<Event> event;

    Scanner in = new Scanner(System.in);

    public Lead() {
        setId();
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.fullName = firstName + " " + lastName;
        this.companyName = setCompanyName();
        this.phoneNumber = setPhoneNumber();
        this.email = setEmail();

        this.leadStatus = "New";

        this.task = new ArrayList<>();
        this.event = new ArrayList<>();
    }

    private static void setId() {
        id++;
        leadId = "L" + id;
    }

    private String setFirstName() {
        System.out.print("Enter lead first name : ");
        String firstName = in.nextLine();
        return firstName;
    }

    private String setLastName() {
        System.out.print("Enter lead last name : ");
        String lastName = in.nextLine();
        return lastName;
    }

    private String setCompanyName() {
        System.out.print("Enter lead company : ");
        String company = in.nextLine();
        return company;
    }

    private String setPhoneNumber() {
        System.out.print("Enter lead phone number : ");
        String phone = in.nextLine();
        return phone;
    }

    private String setEmail() {
        System.out.print("Enter Lead Email : ");
        String email = in.nextLine();
        return email;
    }

    public String getName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setLeadStatus() {
        System.out.print("Change lead status to : ");
        this.leadStatus = in.nextLine();
    }

    public void newTask() {
        task.add(new Task(fullName));
    }

    public void newEvent() {
        event.add(new Event(fullName));
    }

    public void showInfo() {
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Lead ID : " + leadId);
        System.out.println("Company : " + companyName);
        System.out.println("Email : " + email);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Lead Status : " + leadStatus + "\n");
        System.out.println("Activity \n");

        if (!task.isEmpty()) {
            System.out.println("Task : ");
            for (int i = 0; i < task.size(); i++) {
                task.get(i).showInfo();
            }
        } else {
            System.out.println("No task yet.");
        }

        if (!event.isEmpty()) {
            System.out.println("Event : ");
            for (int i = 0; i < event.size(); i++) {
                event.get(i).showInfo();
            }
        } else {
            System.out.println("No event yet.");
        }
    }
}