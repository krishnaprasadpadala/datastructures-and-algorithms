package com.ds.algo.graphs2;

import java.util.*;

public class GraphsUtil {

    public static Map<Integer, ArrayList<Integer>> adjList(int[][] edgeList) {
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for(int[] edge : edgeList) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        return adjList;
    }
}
