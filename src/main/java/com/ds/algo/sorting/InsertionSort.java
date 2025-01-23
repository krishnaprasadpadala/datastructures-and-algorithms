package com.ds.algo.sorting;

import com.ds.algo.util.*;

public class InsertionSort {
    
    public static void sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int k=i;
            while(k>0 && arr[k] < arr[k-1]) {
                DSAUtil.swap(arr, k, k-1);
                k--;
            }
        }
    }
}
