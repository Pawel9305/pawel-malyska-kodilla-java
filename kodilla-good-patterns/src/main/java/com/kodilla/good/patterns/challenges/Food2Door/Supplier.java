package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier {
    private String name;
    private String eMail;
    private String address;

    public Supplier(String name, String eMail, String address) {
        this.name = name;
        this.eMail = eMail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }
}
