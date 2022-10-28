package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

@DisplayName("Test for checking world population")
public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        //Filling continentList with Countries
        europe.addCountry(new Country("Germany", new BigDecimal("111111111")));
        europe.addCountry(new Country("Poland", new BigDecimal("222222222")));
        europe.addCountry(new Country("Netherlands", new BigDecimal("333333333")));
        asia.addCountry(new Country("China", new BigDecimal("999999999")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("444444444")));
        asia.addCountry(new Country("Malaysia", new BigDecimal("555555555")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("666666666")));
        africa.addCountry(new Country("Ghana", new BigDecimal("777777777")));
        africa.addCountry(new Country("Maroko", new BigDecimal("888888888")));
        //Creating World and filling its list with continents containing lists of countries
        World earth = new World();
        earth.addContinent(europe);
        earth.addContinent(asia);
        earth.addContinent(africa);

        //When
        BigDecimal totalPopulation = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("4999999995");
        assertEquals(totalPopulation, expectedPopulation);
    }

}
