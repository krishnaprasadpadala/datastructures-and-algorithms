package com.ds.algo.linkedlist;

public class SizeOfLinkedList {
    
    public static int size(Node head) {
        if (head == null) {
            return 0;
        }
        int size=0;
        Node current = head;
        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
