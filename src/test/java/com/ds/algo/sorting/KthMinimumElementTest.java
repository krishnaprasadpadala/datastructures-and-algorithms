package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class KthMinimumElementTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void testKthMinimumElement(int[] arr, int k, int expected) {
        int result = KthMinimumElement.findKthMinimum(arr, k);
        assertEquals(expected, result);
    }
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[] {4,1,3,2,5}, 2, 2
                ),
                Arguments.of(
                        new int[] {4,1,3,2,5}, 4, 4
                ),
                Arguments.of(
                        new int[] {4,1,3,2,5}, 3, 3
                )
        );
    }
 
}