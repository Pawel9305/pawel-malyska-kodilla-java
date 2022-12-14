package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SupplyInfo implements SupplyStatusInfo {
    @Override
    public void inform(Supplier supplier, Product product, LocalDateTime deliveryDate) {
        System.out.println("Delivery ordered on: " + deliveryDate.toString() + "\nfrom: " + supplier.getName() +
                "\ncontaining: " + product.getName() + "\nquantity: " + product.getQuantity() +
                "\nhas been successfully fulfilled");
    }
}
