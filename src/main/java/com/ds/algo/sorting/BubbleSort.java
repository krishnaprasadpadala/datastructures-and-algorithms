package com.ds.algo.sorting;

import com.ds.algo.util.*;

public class BubbleSort {
    
    public static void sort(int[] arr) {
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    DSAUtil.swap(arr, j, j+1);
                }
            }
        }
    }
}
