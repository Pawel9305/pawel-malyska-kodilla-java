package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SupplyRequestRetriever {
    public SupplyRequest retrieve() {

        Supplier supplier = new Supplier("Extra Food Shop", "ExtraFoodShop@biuro.pl",
                "al.Jerozolimskie 2, Warsaw, 02-140");
        Product product = new Product("Apples", 30);
        LocalDateTime deliveryDate = LocalDateTime.of(2022, 12, 15, 13, 0);

        return new SupplyRequest(supplier, product, deliveryDate);
    }
}
