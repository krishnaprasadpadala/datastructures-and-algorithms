package com.ds.algo.graphs2;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class ConflictedAreaTest {
    
    @ParameterizedTest
    @MethodSource("testData")
    void conflictedAreaTest(char[][] map, char[][] expected) {
        char[][] actual = ConflictedArea.conflictedAreaAfterRecovery(map);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new char[][]{
                                {'I', 'I', 'P', 'I', 'I'},
                                {'I', 'P', 'P', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'P', 'I', 'I', 'P'},
                                {'I', 'P', 'P', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'P', 'I'}
                        },
                        new char[][]{
                                {'I', 'I', 'P', 'I', 'I'},
                                {'I', 'P', 'P', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'P', 'I'}
                        }
                ),
                Arguments.of(
                        new char[][]{
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'P', 'P', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'P', 'I', 'I', 'P'},
                                {'I', 'P', 'P', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'P', 'I'}
                        },
                        new char[][]{
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'I', 'P'},
                                {'I', 'I', 'I', 'P', 'I'}
                        }
                ),
                Arguments.of(
                        new char[][]{
                                {'I', 'I', 'P', 'I', 'I'},
                                {'I', 'P', 'P', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'P', 'I', 'P', 'I'},
                                {'I', 'P', 'P', 'P', 'I'},
                                {'I', 'I', 'I', 'P', 'I'},
                                {'I', 'I', 'I', 'I', 'I'}
                        },
                        new char[][]{
                                {'I', 'I', 'P', 'I', 'I'},
                                {'I', 'P', 'P', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'},
                                {'I', 'I', 'I', 'I', 'I'}
                        }
                )
        );
    }
 }