package com.kodilla.good.patterns.challenges.FlightCompany;


import java.util.List;

public class JourneyDto {
    private List<Flight> journey;

    public JourneyDto(final List<Flight> journey) {
        this.journey = journey;
    }

    public List<Flight> getJourney() {
        return journey;
    }
}
