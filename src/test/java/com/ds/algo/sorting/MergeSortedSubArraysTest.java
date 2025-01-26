package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedSubArraysTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void mergeSortedSubArraysTest(int[] arr, int l, int y, int r, int[] expected) {
        MergeSortedSubArrays.mergeSubArrays(arr, l, y, r);
        assertArrayEquals(expected, arr);
    }    
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,7,5,10,20,30,11,21,50}, 3, 6, 7, new int[]{1,7,5,10,11,20,21,30,50} 
                ),
                Arguments.of(
                        new int[]{1,7,9,10,20,30,11,21,50}, 0, 6, 7, new int[]{1,7,9,10,11,20,21,30,50}
                )
        );
    } 
}