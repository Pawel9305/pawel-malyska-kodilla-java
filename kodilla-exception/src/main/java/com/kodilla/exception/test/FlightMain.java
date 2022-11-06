package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Los Angeles");
        Flight flight1 = new Flight("Lublin", "Gdańsk");
        Flight flight2 = new Flight("Katowice", "Amsterdam");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
            flightFinder.findFlight(flight2);
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
