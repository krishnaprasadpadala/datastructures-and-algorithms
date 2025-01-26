package com.ds.algo.sorting;

public class MergeSort {
    
    
    public static void mergeSort(int[] arr, int l, int r) {
        if(l == r) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    } 
    
    
    private static void merge(int[] arr, int l, int mid, int r) {
        int len = r-l+1;
        int a=l;
        int b=mid+1;
        int k=0;
        int[] temp = new int[len];
        while(a<=mid && b<=r) {
            if(arr[a] <= arr[b]) {
                temp[k++] = arr[a++];
            } else {
                temp[k++] = arr[b++];
            }
        }
        while(a<=mid) {
            temp[k++] = arr[a++];
        }
        while (b<=r) {
            temp[k++] = arr[b++];
        }
        k=0;
        for(int i=l; i<=r; i++) {
            arr[i] = temp[k++];
        }
    }
}
