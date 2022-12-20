package com.kodilla.good.patterns.challenges.FlightCompany;

public class FlightMain {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.findWithStopover("Lublin", "Gdańsk"));
        System.out.println(flightFinder.findWithStopover("Kraków", "Gdańsk"));
        System.out.println(flightFinder.findAllTo("warszawa"));

    }
}
