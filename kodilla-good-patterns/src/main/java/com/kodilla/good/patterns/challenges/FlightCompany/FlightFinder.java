package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder implements TransportationFinder {


    public Set<Flight> retrieveFlights() {
        Flight flight = new Flight("Kraków", "Wrocław");
        Flight flight1 = new Flight("Kraków", "Warszawa");
        Flight flight2 = new Flight("Wrocław", "Gdańsk");
        Flight flight3 = new Flight("Wrocław", "Kraków");
        Flight flight4 = new Flight("Lublin", "Poznań");
        Flight flight5 = new Flight("Poznań", "Gdańsk");
        Flight flight6 = new Flight("Lublin", "Warszawa");
        Set<Flight> flights = new HashSet<>();
        flights.add(flight);
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        return flights;
    }

    public List<Flight> find(String departure, String arrival) {
        return retrieveFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departure))
                .toList();
    }

    public List<Flight> findAllTo(String arrival) {
        return retrieveFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equalsIgnoreCase(arrival))
                .toList();
    }

    public List<Flight> findWithStopover(String departure, String arrival) {
        return retrieveFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departure)
                        || flight.getArrivalAirport().equalsIgnoreCase(arrival))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findWithStopover("Lublin", "Gdańsk");
    }
}
