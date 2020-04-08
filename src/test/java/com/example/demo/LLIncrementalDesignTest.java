package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LLIncrementalDesignTest {

    @Test
    void testGetRealLiquidFilterByCategory() {
        //given
        LLIncrementalDesign sut = new LLIncrementalDesign();
        MyObject expectedObject = new MyObject(3, "real", "solid");
        sut.setMyObjects(Arrays.asList(
//                new MyObject(1, "real", "liquid"),
                new MyObject(2, "fake", "solid"),
                expectedObject
        ));

        //when
        MyObject actualObject = sut.getFirstByCategoryAndMaterial(expectedObject.getCategory(), expectedObject.getMaterial());

        //then
        assertEquals(expectedObject, actualObject, "Values expected to match");
    }
}