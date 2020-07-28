package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Account> accounts = new ArrayList<>();
    private static List<Contact> contacts = new ArrayList<>();
    private static List<Lead> leads = new ArrayList<>();
    private static List<Opportunity> opportunities = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String option = "";

        System.out.println("Welcome to simple CRM app!!");
        System.out.println("Let's create your first lead");
        System.out.println("Happy working!!");

        leads.add(new Lead());

        while (!option.equals("quit")) {

            System.out.println("Choose one of the option bellow. \n");
            System.out.println("1 - Create New Lead \n2 - Show Leads \n3 - Show Opportunities");

            option = in.nextLine();

            if (option.equals("1")) {
                leads.add(new Lead());
                System.out.println("New lead created");
            }

            if (option.equals("2")) {
                for (int i = 0; i < leads.size(); i++) {
                    System.out.println(i + 1 + " - " + leads.get(i).getName());
                }
                System.out.print("Select Lead : ");
                int leadId = in.nextInt() - 1;
                leads.get(leadId).showInfo();

                while (!option.equals("d")) {
                    System.out.println("a - Create new event | b - Create new Task | c - Convert Lead | d - Back");
                    System.out.print("Select one of the option above : ");
                    option = in.nextLine();

                    switch (option) {
                        case "a":
                            leads.get(leadId).newEvent();
                            System.out.println("New Event Created !!");
                            break;

                        case "b":
                            leads.get(leadId).newTask();
                            System.out.println("New Task Created !!");
                            break;

                        case "c":
                            convertLead(leads.get(leadId));
                            leads.remove(leadId);
                            break;

                        default:
                            System.out.println("Please choose from the available option");
                            break;
                    }
                }
            }

            if (option.equals("3")) {
                option = in.nextLine();

                if (!opportunities.isEmpty()) {
                    for (int i = 0; i < opportunities.size(); i++) {
                        System.out.println(i + 1 + " - " + opportunities.get(i).getOpName());
                    }

                    System.out.println("Select Opportunity : ");
                    int opId = in.nextInt() - 1;
                    opportunities.get(opId).showInfo();

                    while (!option.equals("back")) {
                        System.out.println(
                                "a - Create new event | b - Create new Task \n c - Set Stage | d - Close Opportunity \n e - Set Amount | f - New Note");
                        System.out.print("Select one of the option above : ");
                        option = in.nextLine();

                        switch (option) {
                            case "a":
                                opportunities.get(opId).newEvent();
                                System.out.println("Event created !!");
                                break;

                            case "b":
                                opportunities.get(opId).newTask();
                                System.out.println("Task created !!");
                                break;

                            case "c":
                                opportunities.get(opId).setStage();
                                break;

                            case "d":
                                opportunities.get(opId).selectClosedStage();
                                break;

                            case "f":
                                opportunities.get(opId).createNote();
                                break;

                            default:
                                System.out.println("Please choose from the available option");
                                break;
                        }
                    }
                } else {
                    System.out.println("You have no opportunites");
                }
            }
        }
        System.out.println("Thank you, Have a great day !!");
        in.close();
    }

    public static void convertLead(Lead lead) {
        accounts.add(new Account(lead));
        contacts.add(new Contact(lead));
        opportunities.add(new Opportunity(lead, contacts));

        System.out.println("Lead Successfully converted !!");
        System.out.println("New Account, New Contact, and New Opportunity has been created");
    }

    public static void createReport(List<Opportunity> opportunities) {
        Report report = new Report(opportunities);
    }
}
