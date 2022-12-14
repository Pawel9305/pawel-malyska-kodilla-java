package com.kodilla.good.patterns.challenges.Food2Door;

public class SuppliesRepositoryCreator {
    public void addSupplier(Supplier supplier) {
        System.out.println("Added to database: \nsupplier: " + supplier.getName() + "\naddress: " + supplier.getAddress() +
                "\ne-mail: " + supplier.getEmail());
    }
}
