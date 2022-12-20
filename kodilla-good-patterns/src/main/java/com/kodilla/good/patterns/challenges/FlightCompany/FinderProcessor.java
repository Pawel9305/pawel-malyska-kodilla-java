package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;

public class FinderProcessor {

    private TransportationFinder transportationFinder;
    private TransportationRepository transportationRepository;

    public FinderProcessor(final TransportationFinder transportationFinder,
                           final TransportationRepository transportationRepository) {
        this.transportationFinder = transportationFinder;
        this.transportationRepository = transportationRepository;

    }

    public JourneyDto process(final FlightRequest flightRequest) {
            List<Flight> flightsFound = transportationFinder.find(flightRequest.getDeparture(), flightRequest.getArrival());
            transportationRepository.createRoute(flightsFound);
            return new JourneyDto(flightsFound);
    }
}
