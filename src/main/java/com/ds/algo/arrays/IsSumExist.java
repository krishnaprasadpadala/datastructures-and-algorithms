package com.ds.algo.arrays;

import java.util.HashMap;

public class IsSumExist {

    public static int solve(int[] A, int B) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num : A) {
            countMap.put(num,
                    countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : A) {
           int complement = B - num;
           if(countMap.containsKey(complement)) {
               if(complement != num || countMap.get(num) > 1) {
                   return 1;
               }
           }
        }
        return 0;
    }

}
