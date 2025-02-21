package com.ds.algo.linkedlist;

public class FindFirstMid {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node two = head.next = new Node(2);
        Node three = two.next = new Node(3);
        Node four = three.next = new Node(4);
        Node five = four.next = new Node(5);
        Node six = five.next = new Node(6);
        System.out.println(firstMid(head).data);
    }
    
    private static Node firstMid(Node head) {
        if(head.next == null) {
            return head;
        }
        
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
