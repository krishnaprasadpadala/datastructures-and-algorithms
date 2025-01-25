package com.ds.algo.sorting;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class SortByFactorsCountTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void testSort(ArrayList<Integer> arr, ArrayList<Integer> expected) {
        SortByFactorsCount.sort(arr);
        assertEquals(expected, arr);
    }
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<Integer>(Arrays.asList(27, 19, 3, 85, 82, 2, 41, 86, 46, 9)),
                        new ArrayList<Integer>(Arrays.asList(2, 3, 19, 41, 9, 27, 46, 82, 85, 86))                        
                )
        );
    } 

}