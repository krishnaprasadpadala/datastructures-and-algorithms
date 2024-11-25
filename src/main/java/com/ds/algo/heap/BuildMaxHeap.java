package com.ds.algo.heap;

import java.util.*;

public class BuildMaxHeap {

    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3,4, 5};
        System.out.println("before Heapify..!!");
        System.out.println(Arrays.toString(arr));
        arr = buildHeap(arr);
        System.out.println("After Heapify..!!");
        System.out.println(Arrays.toString(arr));
    }
    
    private static int[] buildHeap(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            heapify(arr, i);
        }
        return arr;
    }
    
    private static void heapify(int[] arr, int idx) {
        if(idx == 1) {
            return;
        }
        int parent = idx/2;
        if(arr[parent] < arr[idx]) {                // To build MinHeap change this condition
            int a = arr[parent];
            arr[parent] = arr[idx];
            arr[idx] = a;
            heapify(arr, parent);
        }
    }
 }
