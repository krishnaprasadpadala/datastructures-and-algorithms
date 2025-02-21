package com.ds.algo.linkedlist;

public class Node {
    
    public Node next;
    public int data;
    
    public Node prev;
    public int key;
    
    public Node(int data) {
        this.data = data;
    }
    
    public Node(int key, int data) {
        this.key = key;
        this.data = data;
    }
    
}
