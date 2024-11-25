package com.ds.algo.graphs2;

import java.util.*;

public class ConnectedComponents {
    
    
    public static int count(int size, int[][] edges) {
        if(edges == null) {
            return size;
        }
        
        Map<Integer, ArrayList<Integer>> graph = adjList(edges);
        boolean[] visited = new boolean[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(!visited[i]) {
                dfs(graph, i, visited);
                count++;
            }
        }
        return count;
    }
    
    
    
    private static void dfs(Map<Integer, ArrayList<Integer>> graph, int src, boolean[] visited) {
        visited[src] = true;
        
        ArrayList<Integer> children = graph.get(src);
        if(children == null) {
            return;
        }
        for(int i=0; i<children.size(); i++) {
            if(!visited[children.get(i)]) {
                dfs(graph, children.get(i), visited);
            }
        }
    }

    private static Map<Integer, ArrayList<Integer>> adjList(int[][] edgeList) {
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for(int[] edge : edgeList) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        return adjList;
    }
}
