package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Account> accounts = new ArrayList<>();
    private static List<Lead> leads = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner index = new Scanner(System.in);
        String option = "";

        System.out.println("Welcome to simple CRM app!!");
        System.out.println("Let's create your first lead");
        System.out.println("Happy working!!");

        leads.add(new Lead());

        while (!option.equals("quit")) {

            System.out.println("Choose one of the option bellow. \n");
            System.out.println("1 - Create New Lead \n2 - Show available leads");

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
                int leadId = index.nextInt() - 1;
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

                        case "d":
                            break;

                        default:
                            System.out.println("Please choose from the available option");
                            break;
                    }
                }
            }
        }
        System.out.println("Thank you, Have a great day !!");
    }

    public static void convertLead(Lead lead) {
        accounts.add(new Account(lead));
    }
}
