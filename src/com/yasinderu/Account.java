package com.yasinderu;

public class Account {
    private String name;
    private String phoneNumber;

    public Account(Lead lead) {
        this.name = lead.getCompanyName();
        this.phoneNumber = lead.getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void showAccountDetail() {
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
    }
}