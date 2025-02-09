package com.ds.algo.linkedlist;

public class RemoveNthNodeFromEnd {
    public Node removeNthFromEnd(Node A, int B) {

        int len = 1;
        Node curr = A;
        while(curr.next != null) {
            curr = curr.next;
            len++;
        }
        if(B >= len) {
            return A.next;
        }
        int k = len-B;
        curr = A;
        while(k != 1) {
            curr = curr.next;
            k--;
        }
        if(curr.next != null) {
            curr.next = curr.next.next;
        } else {
            curr.next = null;
        }
        return A;
    }
}
