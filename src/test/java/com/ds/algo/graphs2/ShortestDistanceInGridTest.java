package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceInGridTest {


    @ParameterizedTest
    @MethodSource("shortestDistanceInGridTestData")
    void testShortestDistanceInGrid(int[][] grid, int i, int j, int p, int q, int expected) {
        int actual = ShortestDistanceInGrid.shortestDistance(grid, i, j, p, q);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> shortestDistanceInGridTestData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 0, 1, 1},
                                {1, 0, 1, 1, 1},
                                {0, 1, 1, 0, 1}
                        },
                        1, 0, 3, 4, 8
                ),
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 0, 1, 1},
                                {1, 0, 1, 1, 1},
                                {0, 1, 1, 0, 1}
                        },
                        2, 1, 3, 4, 10
                ),
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 0, 1, 1},
                                {1, 0, 1, 1, 1},
                                {0, 1, 1, 0, 1}
                        },
                        3, 4, 3, 4, 0
                ),
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 0, 1, 1},
                                {1, 0, 1, 1, 1},
                                {0, 1, 1, 0, 1}
                        },
                        4, 4, 3, 4, 1
                )
        );
    }
}