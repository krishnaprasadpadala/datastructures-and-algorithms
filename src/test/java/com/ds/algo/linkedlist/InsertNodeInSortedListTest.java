package com.ds.algo.linkedlist;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class InsertNodeInSortedListTest {
    
    
    @ParameterizedTest
    @MethodSource("testData")
    void testInsertNodeInSortedList(Node head, int data, Node expected) {
        Node actual = InsertNodeInSortedList.insert(head, data);
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
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 5,
                        LinkedListGenerator.generateRandomLinkedList(List.of(5,10,20,30,40,50))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 51,
                        LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50,51))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10,20,30,40,50)), 29,
                        LinkedListGenerator.generateRandomLinkedList(List.of(10,20,29,30,40,50))),
                Arguments.of(null, 5,
                        LinkedListGenerator.generateRandomLinkedList(List.of(5))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10)), 5,
                        LinkedListGenerator.generateRandomLinkedList(List.of(5,10))),
                Arguments.of(LinkedListGenerator.generateRandomLinkedList(List.of(10)), 50,
                        LinkedListGenerator.generateRandomLinkedList(List.of(10,50)))
        );
    }

}