package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Beginning all tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Ending tests.");
    }

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEachTest() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMeanTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double meanTemperature = weatherForecast.calculateMeanTemperature();

        //Then
        Assertions.assertEquals(25.56, meanTemperature);
    }

    @Test
    void testCalculateTemperatureMedian() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.calculateTemperaturesMedian();
        //Then

        Assertions.assertEquals(25.5, weatherForecast.calculateTemperaturesMedian());
    }
}
