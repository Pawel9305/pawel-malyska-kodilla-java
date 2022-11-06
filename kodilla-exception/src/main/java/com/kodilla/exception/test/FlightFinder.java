package com.kodilla.exception.test;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportNames = new HashMap<>();
        String result = flight.getDepartureAirport() + " -> " + flight.getArrivalAirport();
        airportNames.put("Warsaw -> Los Angeles", true);
        airportNames.put("Warsaw -> Oslo", false);
        airportNames.put("Katowice -> Berlin", true);
        airportNames.put("Katowice -> Amsterdam", false);

        if(airportNames.containsKey(result)) {
            System.out.println(result + ": " +airportNames.get(result));
        } else {
            throw new RouteNotFoundException("Flight not found");
        }
    }


}
