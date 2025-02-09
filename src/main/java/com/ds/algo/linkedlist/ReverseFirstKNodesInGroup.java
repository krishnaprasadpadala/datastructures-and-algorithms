package com.ds.algo.linkedlist;

public class ReverseFirstKNodesInGroup {


    public static Node reverseFirstKNodesInGroup(Node head, int k) {
        if(k == 1 || head == null || head.next == null) {
            return head;
        }
        
        Node prev = null;
        Node curr = head;
        while(curr!= null && k>0) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k--;
        }
        head.next = reverseFirstKNodesInGroup(curr, k);
        return prev;
    }
}
