package com.ds.algo.linkedlist;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseFirstKNodesInLinkedListTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void testReverseFirstKNodes(Node head, int k, Node expected) {
        Node actual = ReverseFirstKNodesInLinkedList.reverseFirstKNodes(head, k);
        Node temp1 = expected;
        Node temp2 = actual;
        while(temp1!= null && temp2!= null && temp1.data == temp2.data) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        assertSame(temp1, temp2);
    }




    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 2,
                        LinkedListGenerator.generateRandomLinkedList(List.of(20,10,30,40,50))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 5,
                        LinkedListGenerator.generateRandomLinkedList(List.of(50,40,30,20,10))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 1,
                        LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 3,
                        LinkedListGenerator.generateRandomLinkedList(List.of(30,20,10,40,50)))
               
        );
    }

}