package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Exterminator: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Exterminator: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite end");
    }

    @DisplayName("When creating empty List then " +
    "exterminate should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> empty = new ArrayList<>();
        OddNumbersExterminator emptyExterminator = new OddNumbersExterminator();
        //When
        List<Integer> notFilled = emptyExterminator.exterminate(empty);
        System.out.println("Testing not Filled...");
        //Then
        System.out.println(notFilled);
    }

    @DisplayName("When creating list filled with odd's and even's " +
    "exterminate should return list filled with even's")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normal = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OddNumbersExterminator filledExterminator = new OddNumbersExterminator();
        List<Integer> filled;
        //When
        filled = filledExterminator.exterminate(normal);
        System.out.println("Testing filled...");
        //Then
        System.out.println(filled);
    }
}
