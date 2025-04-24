package com.ds.algo.linkedlist;

import java.util.*;

public class LeastRecentlyUsedCache {

    private HashMap<Integer, Node> map;
    private Node front;
    private Node tail;
    private int size;
    private final int capacity;

    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        //6 1 
        //S 2 1 
        //S 2 2 
        //G 2 
        //S 1 1 
        //S 4 1 
        //G 2
        LeastRecentlyUsedCache l = new LeastRecentlyUsedCache(1);
        l.set(2,1);
        l.set(2,2);
        System.out.println(l.get(2));
        l.set(1,1);
        l.set(4,1);
        System.out.println(l.get(2));
        
    }
    
    

    
    public int get(int key) {
        if(!checkIfExist(key)) {
            return -1;
        }
        Node node = removeNode(key);
        add(key, node);
        return node.data;
    }
    
    public void set(int key, int value) {
        Node node = map.get(key);
        if(node != null) {
            node = removeNode(node.key);
            node.data = value;
            add(key, node);
            return;
        }
        if(capacity == size) {
            remove();
        }
        Node newNode = new Node(key, value);
        add(key, newNode);
    }
    
    private void remove() {
        Node next = front.next;
        map.remove(front.key);
        front.next = null;
        if(next != null)
            next.prev = null;
        front = next;
        size--;
    }
    
    private void add(int key, Node node) {
        map.put(key, node);
        if(front == null && tail == null) {
            front = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    
    private Node removeNode(int key) {
        Node node = map.get(key);
        Node prev = node.prev;
        Node next = node.next;
        node.prev = null;
        node.next = null;
        map.remove(node.key);
        if (prev == null && next == null) {
            front = null;
            tail = null;
            size--;
            return node;
        }
        if(prev == null) {
            next.prev = prev;
            front = next;
            size--;
            return node;
        }
        if(next == null) {
            prev.next = next;
            tail = prev;
            size--;
            return node;
        }
        prev.next = next;
        next.prev = prev;
        size--;
        return node;
    }
    
    private boolean checkIfExist(int key) {
        return map.containsKey(key);
    }
}
