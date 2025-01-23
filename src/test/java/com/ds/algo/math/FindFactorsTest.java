package com.ds.algo.math;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class FindFactorsTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void findFactorsTest(int input, List<Integer> expected) {
        List<Integer> factors = FindFactors.factors(input);
        assertTrue(factors.containsAll(expected));
    }
    
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        49, Arrays.asList(1,7)
                ),
                Arguments.of(
                        36, Arrays.asList(1,2,3,4,6,18,12,9,36)
                ),
                Arguments.of(
                        23, Arrays.asList(1,23)
                )
        );
    } 
}