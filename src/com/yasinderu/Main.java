package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<Account> accounts = new ArrayList<>();
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

            System.out.println("Choose one of the option bellow.");
            System.out.println("1 - Create New Lead \n2 - New Task \n3 - New Event \n4 - Lead Detail");

            option = in.nextLine();

            switch (option) {
                case "1":
                    leads.add(new Lead());
                    System.out.println("New lead created");
                    break;

                case "2":
                    System.out.println("Select lead \n");

                    for (int i = 0; i < leads.size(); i++) {
                        System.out.println(i + 1 + " : " + leads.get(i).getName());
                    }

                    int leadIndex = index.nextInt();
                    leads.get(leadIndex - 1).newTask();
                    System.out.println("New Task created!!");
                    break;

                case "3":
                    System.out.println("Select Lead \n");

                    for (int i = 0; i < leads.size(); i++) {
                        System.out.println(i + 1 + " : " + leads.get(i).getName());
                    }

                    int leadInd = index.nextInt();
                    leads.get(leadInd - 1).newEvent();
                    System.out.println("New Event created!!");
                    break;

                case "4":
                    for (int i = 0; i < leads.size(); i++) {
                        leads.get(i).showInfo();
                    }
                    break;
                default:
                    System.out.println("Please select the right option");
            }
        }
        System.out.println("Thank you, Have a great day !!");
    }

    public void convertLead(Lead lead) {
        accounts.add(new Account(lead));
    }
}
