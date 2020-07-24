package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner index = new Scanner(System.in);
        String choice = "";
        List<Lead> lead = new ArrayList<>();

        System.out.println("Welcome to simple CRM app!!");
        System.out.println("Let's create your first lead");

        lead.add(new Lead());

        while (!choice.equals("quit")) {

            System.out.println("Happy working!!");
            System.out.println("Choose one of the option bellow.");
            System.out.println("1 - Create New Lead \n2 - New Task \n3 - New Event \n4 - Lead Detail");

            choice = in.nextLine();

            switch (choice) {
                case "1":
                    lead.add(new Lead());
                    System.out.println("New lead created");
                    break;

                case "2":
                    System.out.println("Select lead \n");

                    for (int i = 0; i < lead.size(); i++) {
                        System.out.println(i + 1 + " : " + lead.get(i).getName());
                    }

                    int leadIndex = index.nextInt();
                    lead.get(leadIndex - 1).newTask();
                    System.out.println("New Task created!!");
                    break;

                case "3":
                    System.out.println("Select Lead \n");

                    for (int i = 0; i < lead.size(); i++) {
                        System.out.println(i + 1 + " : " + lead.get(i).getName());
                    }

                    int leadInd = index.nextInt();
                    lead.get(leadInd - 1).newEvent();
                    System.out.println("New Event created!!");
                    break;

                case "4":
                    for (int i = 0; i < lead.size(); i++) {
                        lead.get(i).showInfo();
                    }
                    break;
            }
        }
        System.out.println("Thank you, Have a great day !!");
    }
}
