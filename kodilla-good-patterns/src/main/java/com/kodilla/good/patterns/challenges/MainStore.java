package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MainStore {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String translations = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream()).
                collect(Collectors.joining("!"));
        System.out.println(translations);
    }
}
