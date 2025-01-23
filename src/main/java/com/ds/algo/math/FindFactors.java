package com.ds.algo.math;

import java.util.*;

public class FindFactors {
    
    public static List<Integer> factors(int a) {
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);
        factors.add(a);
        for(int i=2; i*i <= a; i++) {
            if(a%i == 0) {
                factors.add(i);
                if(i != a/i) {
                    factors.add(a/i);
                }
            }
        }
        return factors;
    }
}
