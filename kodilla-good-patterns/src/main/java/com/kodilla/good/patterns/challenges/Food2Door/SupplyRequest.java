package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SupplyRequest {
    private Supplier supplier;
    private Product product;
    private LocalDateTime dateOfDelivery;

    public SupplyRequest(Supplier supplier, Product product, LocalDateTime dateOfDelivery) {
        this.supplier = supplier;
        this.product = product;
        this.dateOfDelivery = dateOfDelivery;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
