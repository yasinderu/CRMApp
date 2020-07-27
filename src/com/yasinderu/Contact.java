package com.yasinderu;

public class Contact {
    private String name;
    private String phoneNumber;
    private String accountName;
    private String email;

    public Contact(Lead lead) {
        this.name = lead.getName();
        this.phoneNumber = lead.getPhoneNumber();
        this.accountName = lead.getCompanyName();
        this.email = lead.getEmail();
    }

    public String getName() {
        return name;
    }

    public void showDetail() {
        System.out.println("Name : " + name);
        System.out.println("Account Name : " + accountName);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
    }
}