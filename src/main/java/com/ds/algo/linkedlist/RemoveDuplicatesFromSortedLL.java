package com.ds.algo.linkedlist;

public class RemoveDuplicatesFromSortedLL {

    public Node deleteDuplicates(Node A) {
        if(A == null || A.next == null) {
            return A;
        }
        Node curr = A;
        while(curr.next.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        if(curr.data == curr.next.data) {
            curr.next = null;
        }
        return A;
    }
}
