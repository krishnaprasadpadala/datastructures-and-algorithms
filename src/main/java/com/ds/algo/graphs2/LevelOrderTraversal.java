package com.ds.algo.graphs2;

import java.util.*;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {3, 6}};
        int size1 = 7;
        int src1 = 0;
        Map<Integer, ArrayList<Integer>> graph1 = edgeListToAdjList(edges1);
        List<Integer> result1 = bfs(size1, src1, graph1);
        System.out.println("result1:"+ result1);

        int[][] edges2 = {{0, 1}, {0, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int size2 = 8;
        int src2 = 0;
        Map<Integer, ArrayList<Integer>> graph2 = edgeListToAdjList(edges2);
        List<Integer> result2 = bfs(size2, src2, graph2);
        System.out.println("result2:"+ result2);

        int[][] edges3 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {5, 6}, {6, 4}};
        int size3 = 7;
        int src3 = 0;
        Map<Integer, ArrayList<Integer>> graph3 = edgeListToAdjList(edges3);
        List<Integer> result3 = bfs(size3, src3, graph3);
        System.out.println("result3:"+ result3);

        int[][] edges4 = {{0, 1}, {1, 2}, {1, 3}, {3, 4}, {4, 2}, {0, 5}, {5, 6}, {6, 7}};
        int size4 = 8;
        int src4 = 0;
        Map<Integer, ArrayList<Integer>> graph4 = edgeListToAdjList(edges4);
        List<Integer> result4 = bfs(size4, src4, graph4);
        System.out.println("result4:"+ result4);

        int[][] edges5 = {{0, 1}, {0, 2}, {0, 3}, {1, 4}, {2, 4}, {3, 4}, {4, 5}, {5, 6}, {4, 6}};
        int size5 = 7;
        int src5 = 0;
        Map<Integer, ArrayList<Integer>> graph5 = edgeListToAdjList(edges5);
        List<Integer> result5 = bfs(size5, src5, graph5);
        System.out.println("result5:"+ result5);
    }
    
    
    public static List<Integer> bfs(int size, int src, Map<Integer, ArrayList<Integer>> adjList) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] visited = new int[size];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited[src] = 1;

        // Iterate over the queue and for every pop add the elm to the result
        while(!queue.isEmpty()) {


            // Pop the element and Get the neighbours
            int node = queue.poll();
            result.add(node);
            ArrayList<Integer> neighbours = adjList.get(node);
            if(neighbours == null) {
                continue;
            }

            // Iterate over the neighbours and add them to the queue if not visited
            for(int child : neighbours) {

                if(visited[child] == 0) {
                    queue.add(child);
                    visited[child] = 1;
                }
            }
        }
        return result;
    }
    
    private static Map<Integer, ArrayList<Integer>> edgeListToAdjList(int[][] edgeList) {
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for(int[] edge : edgeList) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        return adjList;
    }
}
