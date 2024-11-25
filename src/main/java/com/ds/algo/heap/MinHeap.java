package com.ds.algo.heap;

import java.util.*;
import java.util.stream.*;

public class MinHeap {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(4);
        arr.add(8);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(9);
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        PriorityQueue<Integer> q = new PriorityQueue<>(arr2);
        
        System.out.println(arr);
        buildHeap(arr);
        System.out.println(arr);
        
        remove(arr);
        System.out.println("after remove");
        System.out.println(arr);
        

        List<Integer> collect = q.stream().map(a -> a.intValue()).collect(Collectors.toList());
        System.out.println(collect);
        Integer minValue = q.poll();
        collect = q.stream().map(a -> a.intValue()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(minValue);
    }
    
    public static void buildHeap(ArrayList<Integer> arr) {
        
        for(int i=0; i<arr.size(); i++) {
            int k = i;

            while(k > 0) {
                int p = (k-1)/2;
                if(arr.get(k) < arr.get(p)) {
                    int a = arr.get(k);
                    arr.set(k, arr.get(p));
                    arr.set(p, a);
                } else {
                    break;
                }
                k = p;
            }
        }
    }
    
    public static int remove(ArrayList<Integer> arr) {
        int result = arr.get(0);
        int last = arr.remove(arr.size() -1);
        arr.set(0, last);
        int k=0;
        int size = arr.size()-1;
        while(k<size) {
            int currMin = arr.get(k);
            int leftIdx = 2*k+1;
            int rightIdx = 2*k+2;
            int childIdx = -1;
            if(leftIdx<=size && rightIdx<=size && arr.get(leftIdx)<currMin && arr.get(rightIdx) < currMin) {
                childIdx = arr.get(leftIdx)<arr.get(rightIdx) ? (2*k+1) : (2*k+2);
            } else if(leftIdx<=size && arr.get(leftIdx) < currMin) {
                childIdx = (2*k+1);
            } else if(rightIdx<=size && arr.get(rightIdx) < currMin) {
                childIdx = (2*k+2);
            } else {
                break;
            }
            int a = arr.get(k);
            arr.set(k, arr.get(childIdx));
            arr.set(childIdx, a);
            k = childIdx;
        }
        return result;
    }
     
}
