package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.rangeClosed(1, numbers.length)
                .forEach(n -> System.out.print(n + " "));

        return  IntStream.rangeClosed(1, numbers.length)
                .average()
                .getAsDouble();
    }

}
