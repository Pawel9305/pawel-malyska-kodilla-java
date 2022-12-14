package com.kodilla.good.patterns.challenges.Food2Door;

public class DeliveryProcessor  {
    private SupplierProcess supplierProcess;
    private SupplyStatusInfo supplyStatusInfo;

    public DeliveryProcessor(final SupplierProcess supplierProcess, final SupplyStatusInfo supplyStatusInfo) {
        this.supplierProcess = supplierProcess;
        this.supplyStatusInfo = supplyStatusInfo;
    }

    public SupplyDto process(final SupplyRequest supplyRequest) {
        SuppliesRepositoryCreator suppliesRepositoryCreator = new SuppliesRepositoryCreator();
        boolean isFulfilled = supplierProcess.process(supplyRequest.getSupplier());
        if(isFulfilled) {
            supplyStatusInfo.inform(supplyRequest.getSupplier(), supplyRequest.getProduct(), supplyRequest.getDateOfDelivery());
            suppliesRepositoryCreator.addSupplier(supplyRequest.getSupplier());
            return new SupplyDto(supplyRequest.getSupplier(), supplyRequest.getProduct(), supplyRequest.getDateOfDelivery(), true);
        } else {
            return new SupplyDto(supplyRequest.getSupplier(), supplyRequest.getProduct(), supplyRequest.getDateOfDelivery(), false);
        }
    }


}
