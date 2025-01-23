package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArraysTest {


    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] a, int[] b, int[] output) {
        int[] result = MergeTwoSortedArrays.merge(a, b);
        assertArrayEquals(result, output);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 23, 57, 101, 110}, new int[]{20, 40, 50, 60, 70, 99}, new int[]{1, 20, 23, 40, 50, 57, 60, 70, 99, 101, 110}
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}
                )
        );
    }
}