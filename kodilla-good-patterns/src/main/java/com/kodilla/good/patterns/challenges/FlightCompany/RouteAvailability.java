package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public interface RouteAvailability {
    boolean isAvailable(FlightRequest flightRequest, List<Flight> flights);
}
