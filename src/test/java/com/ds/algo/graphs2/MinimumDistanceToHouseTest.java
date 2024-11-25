package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceToHouseTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shortestDistanceToHomeTest(char[][] grid, int[][] expected) {
        int[][] actual = MinimumDistanceToHouse.shortestDistance(grid);
        assertArrayEquals(expected, actual);
    }


    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new char[][]{
                                {'R', 'R', 'R', 'H'},
                                {'R', 'R', 'H', 'H'},
                                {'R', 'H', 'H', 'R'},
                        },
                        new int[][]{
                                {3, 2, 1, 0},
                                {2, 1, 0, 0},
                                {1, 0, 0, 1}
                        }
                )
        );
    }

}