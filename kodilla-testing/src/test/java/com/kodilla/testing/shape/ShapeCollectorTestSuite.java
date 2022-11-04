package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All the tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestCircle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 5.0);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(1, shapeCollector.shapeList.size());
        }

        @Test
        void removeFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 5.0);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.shapeList.size());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 5.0);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            assertFalse(result);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 5.0);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(circle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 5.0);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(shapeCollector.getFigure(0).getShapeName() + shapeCollector.getFigure(0).getField(),
                    shapeCollector.showFigures());
        }
    }
}
