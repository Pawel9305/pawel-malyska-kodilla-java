package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.Objects;

public class Tuple {
    private Flight firstFlight;
    private Flight secondFlight;

    public Tuple(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple tuple = (Tuple) o;

        return Objects.equals(firstFlight, tuple.firstFlight) && Objects.equals(secondFlight, tuple.secondFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstFlight, secondFlight);
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}
