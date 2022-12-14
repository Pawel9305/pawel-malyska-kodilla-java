package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface SupplyStatusInfo {
    void inform(Supplier supplier, Product product, LocalDateTime deliveryDate);
}
