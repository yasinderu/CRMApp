package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opportunity {
    private String opName;
    private String accountName;
    private String closeDate;
    private String stage;
    private double amount;

    private List<Task> tasks;
    private List<Event> events;

    private List<Contact> contacts;

    Scanner in = new Scanner(System.in);

    public Opportunity(Lead lead, List<Contact> contacts) {
        setOpName();
        this.accountName = lead.getCompanyName();
        this.closeDate = "";
        this.stage = "Qualification";
        this.amount = 0;

        this.contacts = contacts;

        this.tasks = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    private void setOpName() {
        System.out.print("Opportunity name : ");
        this.opName = in.nextLine();
    }

    public void setCloseDate() {
        System.out.print("Insert Date : ");
        this.closeDate = in.nextLine();
    }

    public void setStage() {
        System.out.println("Select stage below");
        System.out.println("a - Need Analysis | b - Proposal | c - Negotiation");
        String option = in.nextLine();

        switch (option) {
            case "a":
                this.stage = "Need Analysis";
                break;

            case "b":
                this.stage = "Proposal";
                break;

            case "c":
                this.stage = "Negotiation";
                break;
        }
    }

    public void setAmount() {
        System.out.print("Set ammount : ");
        double amount = in.nextDouble();
        this.amount = amount;
    }

    public String getOpName() {
        return opName;
    }

    public void newTask() {
        System.out.println("Select name from contacts \n");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + " - " + contacts.get(i).getName());
        }
        int contactInd = in.nextInt() - 1;
        tasks.add(new Task(contacts.get(contactInd).getName()));
    }

    public void newEvent() {
        System.out.println("Select name from contacts \n");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + " - " + contacts.get(i).getName());
        }
        int contactInd = in.nextInt() - 1;
        events.add(new Event(contacts.get(contactInd).getName()));
    }

    public void showInfo() {
        System.out.println("Details.");
        System.out.println("Opportunity Name : " + opName);
        System.out.println("Account Name : " + accountName);
        System.out.println("Close Date : " + closeDate);
        System.out.println("Stage : " + stage);
        System.out.println("Amount : $" + amount);

        System.out.println("\n Activities. \n");
        System.out.println("Events. \n");
        for (int i = 0; i < events.size(); i++) {
            events.get(i).showInfo();
        }

        System.out.println("\n Task. \n");
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).showInfo();
        }
    }
}