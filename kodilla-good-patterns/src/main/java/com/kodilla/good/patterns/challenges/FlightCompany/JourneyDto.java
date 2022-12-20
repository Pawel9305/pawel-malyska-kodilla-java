package com.kodilla.good.patterns.challenges.FlightCompany;


public class JourneyDto {
    private Flight flight;

    public JourneyDto(final Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
