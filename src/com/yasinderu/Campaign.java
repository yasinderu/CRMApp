package com.yasinderu;

import java.util.Scanner;

public class Campaign {
    private String name;
    private boolean active;
    private String type;
    private String status;
    private String startDate;
    private String endDate;

    Scanner in = new Scanner(System.in);

    public Campaign() {
        setName();
        setActive();
        setType();
        setStatus();
        setDate();
    }

    private void setName() {
        System.out.print("Campaign Name : ");
        this.name = in.nextLine();
    }

    private void setActive() {
        System.out.println("Set campaign as active ? y/n");
        String option = in.nextLine().toLowerCase();

        if (option.equals("y")) {
            this.active = true;
            System.out.println("Campaign is currently active");
        }

        if (option.equals("n")) {
            this.active = false;
            System.out.println("Campaign is currently inactive");
        }
    }

    public boolean IsActive() {
        return active;
    }

    private void setType() {
        System.out.print("Campaign type : ");
        this.type = in.nextLine();
    }

    private void setStatus() {
        System.out.println("Select status : \na. none \nb. In Progress \nc. Completed \nd. Aborted \ne. Planned");
        String option = in.nextLine();

        switch (option) {
            case "a":
                this.status = "none";
                break;

            case "b":
                this.status = "In Progress";
                break;

            case "c":
                this.status = "Completed";
                break;

            case "d":
                this.status = "Aborted";
                break;

            case "e":
                this.status = "Planned";
                break;

            default:
                System.out.println("Please select the available option.");
                break;
        }
    }

    private void setDate() {
        System.out.print("Start Date : ");
        this.startDate = in.nextLine();

        System.out.print("End Date : ");
        this.endDate = in.nextLine();
    }

    public void showDetail() {
        System.out.println("Campaign Name : " + name);
        System.out.println("Status : " + status);
        System.out.println("Type : " + type);
        System.out.println("Start Date : " + startDate);
        System.out.println("End Date : " + endDate);

        if (active) {
            System.out.println("Campaign is currently active");
        } else {
            System.out.println("Campaign is not active");
        }
    }
}