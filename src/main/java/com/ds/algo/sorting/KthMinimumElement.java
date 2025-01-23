package com.ds.algo.sorting;

import com.ds.algo.util.*;

public class KthMinimumElement {
    
    public static int findKthMinimum(int[] arr, int k) {
        for(int i=0; i<k; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            DSAUtil.swap(arr, i, min);
        }
        return arr[k-1];
    }
}
