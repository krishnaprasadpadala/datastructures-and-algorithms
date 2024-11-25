package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void numberOfIslandsTest(int[][] grid, int expected) {
        int count = NumberOfIslands.count(grid);
        assertEquals(expected, count);
    }
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][] {
                                {1,1,0,0,1},
                                {0,1,0,1,0},
                                {1,0,0,1,1},
                                {1,1,0,0,0},
                                {1,0,1,1,1}
                        },
                        5
                ),
                Arguments.of(
                        new int[][] {
                                {1,1,0,0,1},
                                {1,1,0,1,0},
                                {1,0,0,1,1},
                                {1,1,0,0,0},
                                {1,0,1,1,1}
                        },
                        4
                ),
                Arguments.of(
                        new int[][] {
                                {1,1,0,0,1},
                                {1,1,1,1,0},
                                {1,0,0,1,1},
                                {1,1,0,0,0},
                                {1,0,1,1,1}
                        },
                        3
                ),
                Arguments.of(
                        new int[][] {
                                {1,1,0,1,1},
                                {1,1,1,1,0},
                                {1,0,0,1,1},
                                {1,1,0,0,0},
                                {1,0,1,1,1}
                        },
                        2
                ),
                Arguments.of(
                        new int[][] {
                                {1,1,0,1,1},
                                {1,1,1,1,0},
                                {1,0,0,1,1},
                                {1,1,0,1,0},
                                {1,0,1,1,1}
                        },
                        1
                )
        );
    }

}