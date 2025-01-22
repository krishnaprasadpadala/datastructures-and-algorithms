package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SelectionSortTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void selectionSortTest(int[] input, int[] output) {
        SelectionSort.sort(input);
        assertArrayEquals(input, output);
    }
    
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{4, 1, 2, 5, 3}, new int[]{1, 2, 3, 4, 5}
                ),
                Arguments.of(
                        new int[]{4, 1}, new int[]{1, 4}
                )
        );
    }
    
    
    
    
    

}