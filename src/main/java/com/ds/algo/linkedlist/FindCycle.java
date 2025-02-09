package com.ds.algo.linkedlist;

public class FindCycle {
    public Node detectCycle(Node a) {
        if(a == null || a.next == null) {
            return null;
        }
        if(a.next == a) {
            return a;
        }

        Node slow = a;
        Node fast = a;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        Node curr = a;
        while(curr != slow) {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
}
