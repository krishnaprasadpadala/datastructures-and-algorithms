package com.ds.algo.linkedlist;

public class InsertNodeInSortedList {
    
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            return newNode;
        }
        if(val <= head.data) {
            newNode.next = head;
            return newNode;
        }
        Node prev = null;
        Node curr = head;
        while(curr != null && val >= curr.data) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;
        return head;
    }
}
