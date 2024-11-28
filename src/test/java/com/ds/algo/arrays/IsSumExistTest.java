package com.ds.algo.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsSumExistTest {

    @ParameterizedTest
    @MethodSource("testData")
    void isSumExistTest(int[] a, int b, int expected) {
        int actual = IsSumExist.solve(a, b);
        assertEquals(expected, actual);
    }


    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 4}, 4, 0
                ),
                Arguments.of(
                        new int[]{1, 2, 4}, 5, 1
                )
        );
    }
}