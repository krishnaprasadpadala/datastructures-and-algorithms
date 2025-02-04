package com.ds.algo.linkedlist;

import java.util.*;

public class LinkedListGenerator {
    
    public static Node generateRandomLinkedList(List<Integer> list) {
        Node head = new Node(list.get(0));
        Node current = head;
        for(int i = 1; i < list.size(); i++) {
            Node next = new Node(list.get(i));
            current.next = next;
            current = next;
        }
        return head;
    }
}
