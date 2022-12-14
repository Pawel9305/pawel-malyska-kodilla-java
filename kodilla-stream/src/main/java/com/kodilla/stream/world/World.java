package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountries().stream()
                .map(Country::getPeopleQuantity))
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
