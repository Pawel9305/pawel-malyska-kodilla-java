package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        // adding 1 celsius degree to current value
        // as a temporary weather forecast
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateMeanTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> mean : temperatures.getTemperatures().entrySet()) {
            sum += mean.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateTemperaturesMedian() {
        List<Double> temperatureList = new ArrayList<>();
        for (Map.Entry<String , Double> value : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(value.getValue());
        }

        Collections.sort(temperatureList);

        if (temperatureList.size() % 2 == 0) {
            return temperatureList.get((temperatureList.size() + 1) / 2);
        } else {
            return temperatureList.get(temperatureList.size() / 2);
        }
    }
}
