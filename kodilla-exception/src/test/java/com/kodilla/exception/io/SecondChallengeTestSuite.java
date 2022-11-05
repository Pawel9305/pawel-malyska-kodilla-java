package com.kodilla.exception.io;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyWillThrowExceptionBoundaryValueX() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1));
    }

    @Test
    void testProbablyWillThrowExceptionBoundaryValueY() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1.4));
    }

    @Test
    void testProbablyWillThrowExceptionWrongXValue() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.4));
    }

    @Test
    void testProbablyWillThrowExceptionWrongYValue() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1, 1.5));
    }

    //Test using assertAll
    @Test
    void testProbablyWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(() -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1, 1.5)));
    }
}
