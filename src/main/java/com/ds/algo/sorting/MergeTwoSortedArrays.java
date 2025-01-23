package com.ds.algo.sorting;

public class MergeTwoSortedArrays {
    
    
    public static int[] merge(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int newLen = aLen + bLen;
        int[] result = new int[newLen];
        int i=0, j=0,k=0;
        while(i<aLen && j<bLen) {
            if(a[i]<=b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while(i<aLen) {
            result[k++] = a[i++];
        }
        while(j<bLen) {
            result[k++] = a[j++];
        }
        return result;
    }
}
