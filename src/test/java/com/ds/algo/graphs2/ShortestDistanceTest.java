package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceTest {
    
    @ParameterizedTest
    @MethodSource("shortestDistanceTestData")
    void shortestDistanceTest(int[][] edges, int size, int src, int dest, int expected) {
        Map<Integer, ArrayList<Integer>> graph = GraphsUtil.adjList(edges);
        int actualDistance = ShortestDistance.shortestDistance(size, src, dest, graph);
        assertEquals(expected, actualDistance);
    }
    
    static Stream<Arguments> shortestDistanceTestData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {3, 6}},
                        7,
                        0,
                        6,
                        3
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {0, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}},
                        8,
                        0,
                        7,
                        6
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {5, 6}, {6, 4}},
                        7,
                        0,
                        6,
                        3
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}, {4, 2}, {0, 5}, {5, 6}, {6, 7}},
                        8,
                        0,
                        7,
                        3
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}, {2, 4}, {3, 4}, {4, 5}, {5, 6}, {4, 6}},
                        7,
                        0,
                        6,
                        3
                )
        );
    }
}