package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SupplyDto {

    private Supplier supplier;
    private Product product;
    private LocalDateTime deliveryDate;
    private boolean isFulfilled;

    public SupplyDto(final Supplier supplier, final Product product, final LocalDateTime deliveryDate,
                     final boolean isFulfilled) {
        this.supplier = supplier;
        this.product = product;
        this.deliveryDate = deliveryDate;
        this.isFulfilled = isFulfilled;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }
}
