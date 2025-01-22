package com.ds.algo.sorting;

import com.ds.algo.util.*;

public class SelectionSort {
    
    
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            DSAUtil.swap(arr, i, min);
        }
    }
}
