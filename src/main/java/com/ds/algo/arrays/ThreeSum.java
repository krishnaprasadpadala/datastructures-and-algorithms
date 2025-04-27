package com.ds.algo.arrays;

import java.util.*;
import java.util.stream.*;

public class ThreeSum {

    public static void main(String[] args) {
        int arr[] = {2, -2, 0, 3, -3, 5};
        findTriplets(arr, 0).forEach(triplet -> {
            System.out.println("Triplet: " + triplet);
        });
        
    }
    
    
    public static List<List<Integer>> findTriplets(int[] arr, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=i+1; j<arr.length; j++) {
                int complement = target - (arr[i] + arr[j]);
                Integer value = map.get(complement);
                if(value != null && value != i && value != j) {
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[value]);
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                } else {
                    map.put(arr[j], j);
                }
            }
        }
        return resultSet.stream().toList();
    }
}
