package com.ds.algo.linkedlist;

public class ReverseFirstKNodesInLinkedList {
    
    public static Node reverseFirstKNodes(Node head, int k) {
        if(k == 1 || head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(k>0) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k--;
        }
        head.next = curr;
        return prev;
    }
}
