package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public class FlightRepository implements TransportationRepository {
    public List<Flight> createRoute(List<Flight> flights) {
        System.out.println("Ordered Flight has been added to database");
        return flights;
    }
}
