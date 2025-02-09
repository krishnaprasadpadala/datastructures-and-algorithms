package com.ds.algo.linkedlist;

public class ReverseNodesFromBToC {
    public Node reverseBetween(Node A, int B, int C) {

        if(A.next == null) {
            return A;
        }
        int k = C-B+1;
        Node prev = null;
        Node curr = A;
        while(B != 1) {
            prev = curr;
            curr = curr.next;
            B--;
        }
        if(prev == null) {
            return reverseKNodes(curr, k);
        }
        prev.next = reverseKNodes(curr, k);
        return A;
    }

    private Node reverseKNodes(Node head, int k) {

        if(head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node prev = null;
        while(curr != null && k>0) {
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
