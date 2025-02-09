package com.ds.algo.linkedlist;

public class RemoveCycleLink {
    public Node solve(Node a) {
        if(a == null || a.next == null) {
            return null;
        }
        if(a.next == a) {
            return a;
        }

        Node slow = a;
        Node fast = a;
        Node prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
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
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        return a;

    }
}
