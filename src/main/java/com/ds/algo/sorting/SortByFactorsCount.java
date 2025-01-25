package com.ds.algo.sorting;

import com.ds.algo.math.*;

import java.util.*;

public class SortByFactorsCount {
    
    public static void sort(ArrayList<Integer> arr) {
        arr.sort(new SortByFactorsCountComparator());
    }
    
    public static class SortByFactorsCountComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            int countA = FindFactors.factors(a).size();
            int countB = FindFactors.factors(b).size();
            if(countA < countB) {
                return -1;
            } else if(countA > countB) {
                return 1;
            } else {
                return a<=b ? -1 : 1;
            }
        }
    }
}
