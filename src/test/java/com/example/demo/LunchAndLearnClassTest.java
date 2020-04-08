package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LunchAndLearnClassTest {

    private LunchAndLearnClass sut;

    @BeforeEach
    void setUp() {
        sut = new LunchAndLearnClass();
    }

    @Test
    void testWith100Coverage() {
        //when
        float actualValue = sut.divide((float) 4.5, 3);

        //then
        assertEquals(1.5, actualValue);
    }

    @Test
    void testDivisionByZeroThrowInvalidArgumentException() {
        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sut.divide((float) 4.5, 0);
        });
    }
}