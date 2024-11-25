package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class RottenOrangesTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void rottenOrangesTest(int[][] grid, int expected) {
        int actual = RottenOranges.isCompleteRotten(grid);
        assertEquals(expected, actual);
    }
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][] {
                                {2,1,1,1},
                                {1,1,2,1},
                                {1,1,1,1},
                                {1,1,1,2}
                        },
                        1
                ),
                Arguments.of(
                        new int[][] {
                                {2,1,1,1},
                                {1,1,2,1},
                                {1,1,0,0},
                                {1,1,0,1}
                        },
                        -1
                ),
                Arguments.of(
                        new int[][] {
                                {2,1,1,1},
                                {1,1,2,1},
                                {1,1,0,1},
                                {1,1,0,1}
                        },
                        1
                )
        );
    }

}