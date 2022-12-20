package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public interface TransportationRepository {
    List<Flight> createRoute(List<Flight> route);
}
