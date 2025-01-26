package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void testMergeSort(int[] arr, int l, int r, int[] expected) {
        MergeSort.mergeSort(arr, l, r);
        assertArrayEquals(expected, arr);
    }
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,7,5,10,20,30,11,21,50}, 0, 8, new int[]{1,5,7,10,11,20,21,30,50} 
                ),
                Arguments.of(
                        new int[]{1,0}, 0, 1, new int[]{0,1}
                ),
                Arguments.of(
                        new int[]{1}, 0, 0, new int[]{1}
                )
        );
    } 

}