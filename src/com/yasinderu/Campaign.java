package com.yasinderu;

public class Campaign {
    private String name;
    private boolean active;
    private String type;
    private String status;
    private String startDate;
    private String endDate;

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