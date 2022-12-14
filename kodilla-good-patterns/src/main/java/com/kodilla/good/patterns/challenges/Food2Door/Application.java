package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        SupplyRequestRetriever supplyRequestRetriever = new SupplyRequestRetriever();
        SupplyRequest supplyRequest = supplyRequestRetriever.retrieve();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(new SuppliersProcessor(), new SupplyInfo());
        deliveryProcessor.process(supplyRequest);
    }
}
