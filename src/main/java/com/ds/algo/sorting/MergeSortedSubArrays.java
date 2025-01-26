package com.ds.algo.sorting;

public class MergeSortedSubArrays {
    
    
    public static void mergeSubArrays(int[] arr, int l, int y, int r) {
        int len = r-l+1;
        int a=l;
        int b=y;
        int[] temp = new int[len];
        int k=0;
        while(a<y && b<=r) {
            if(arr[a] <= arr[b]) {
                temp[k++] = arr[a++];
            } else {
                temp[k++] = arr[b++];
            }
        }
        while(a<y) {
            temp[k++] = arr[a++];
        }
        while(b<=r) {
            temp[k++] = arr[b++];
        }
        k=0;
        for(int i=l; i<=r; i++) {
            arr[i] = temp[k++]; 
        }
    }
}
