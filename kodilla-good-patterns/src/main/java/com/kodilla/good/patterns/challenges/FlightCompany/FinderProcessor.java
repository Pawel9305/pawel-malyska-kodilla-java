package com.kodilla.good.patterns.challenges.FlightCompany;

public class FinderProcessor {

    private TransportationFinder transportationFinder;
    private TransportationRepository transportationRepository;
    private RouteAvailability routeAvailability;

    public FinderProcessor(final TransportationFinder transportationFinder,
                           final TransportationRepository transportationRepository,
                           final RouteAvailability routeAvailability) {
        this.transportationFinder = transportationFinder;
        this.transportationRepository = transportationRepository;
        this.routeAvailability = routeAvailability;
    }

    public JourneyDto process(final FlightRequest flightRequest) {
        boolean isAvailable = routeAvailability.isAvailable(flightRequest, transportationFinder.find(flightRequest.getDeparture()
                , flightRequest.getArrival()));
        if(isAvailable) {
            transportationRepository.createRoute();
        }
    }
}
