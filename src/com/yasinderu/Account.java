package com.yasinderu;

public class Account {
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;

    public Account(Lead lead) {
        this.name = lead.getName();
        this.phoneNumber = lead.getPhoneNumber();
        this.email = lead.getEmail();
        this.companyName = lead.getCompanyName();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }
}