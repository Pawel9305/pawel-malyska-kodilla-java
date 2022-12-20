package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public interface TransportationFinder {
    List<Flight> find(String departure, String arrival);
    List<Flight> findAllTo(String arrival);
    List<Tuple> findWithStopover(String departure, String arrival);

}
