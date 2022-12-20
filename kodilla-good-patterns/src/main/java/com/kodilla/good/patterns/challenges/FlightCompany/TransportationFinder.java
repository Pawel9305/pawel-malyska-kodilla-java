package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public interface TransportationFinder {
    List<Flight> find(String departure, String arrival);
}
