package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class ConnectedComponentsTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void connectedComponents(int size, int[][] edges, int expected) {
        int count = ConnectedComponents.count(size, edges);
        assertEquals(expected, count);
    }
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        6,
                        new int[][] {{0, 1}, {1, 2}, {3, 4}, {4, 5}},
                        2
                ),
                Arguments.of(
                        5,
                        new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}},
                        1
                ),
                Arguments.of(
                        4,
                        null,
                        4
                ),
                Arguments.of(
                        6,
                        new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}},
                        1
                ),
                Arguments.of(
                        8,
                        new int[][]{{0, 1}, {1, 2}, {3, 4}, {5, 6}},
                        4
                )
        );
    }

}