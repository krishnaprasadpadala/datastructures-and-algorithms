package com.ds.algo.linkedlist;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class SizeOfLinkedListTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void testSizeOfLinkedList(Node head, int expectedSize) {
        int actual = SizeOfLinkedList.size(head);
        assertEquals(expectedSize, actual);
    }
    
    
    
    static Stream<Arguments> testData() {
        return Stream.of(
          Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(1,2,3,4,5)), 5),
          Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(1)), 1),
          Arguments.arguments(null, 0)      
        );
    } 

}