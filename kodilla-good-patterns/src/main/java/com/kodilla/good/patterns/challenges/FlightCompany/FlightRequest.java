package com.kodilla.good.patterns.challenges.FlightCompany;


public class FlightRequest {

    private String departure;
    private String arrival;


    public FlightRequest(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
