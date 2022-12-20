package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public List<Tuple> findWithStopover(String departure, String arrival) {
        List<Flight> firstFlight = retrieveFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departure)).toList();

        List<Flight> secondFlight = retrieveFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equalsIgnoreCase(arrival)).toList();

        return firstFlight.stream()
                .filter(ff -> secondFlight.stream()
                        .anyMatch(sf -> sf.getDepartureAirport().equalsIgnoreCase(ff.getArrivalAirport())))
                .map(ff2 ->
                        new Tuple(ff2, secondFlight.stream().filter(sf -> sf.getDepartureAirport()
                                .equalsIgnoreCase(ff2.getArrivalAirport())).findAny().get())).toList();
    }
}
