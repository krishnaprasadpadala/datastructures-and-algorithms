package com.ds.algo.graphs2;

import java.util.*;

public class ShortestDistanceInGrid {
    
    
    public static int shortestDistance(int[][] grid, int i, int j, int p, int q) {
        // check if src is equal to dest 
        if(i == p && j == q) {
            return 0;
        }
        // initialse the queue, Node and visited array
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        ArrayDeque<Node> queue = new ArrayDeque<>(n*m);
        Node src = new Node(i, j, 0);

        // and move the src to queue
        queue.add(src);
        
        // mark the src as visited
        visited[i][j] = 1;
        int[][] rowsAndCols = {{0,-1}, {0,1}, {-1,0}, {1, 0}};


        // iterate over the queue
        // for every popup -> Iterate over the adjacent nodes
        // if: the node is eligible for visit
        // if node == dest return dest + 1
        //else if it is not visited create new node with +1 dest  and add to queue
        
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            for(int k=0; k<4; k++) {
                int newRow = cur.i + rowsAndCols[k][0];
                int newCol = cur.j + rowsAndCols[k][1];
                if(newRow >= 0 && newRow < n 
                    && newCol >= 0 && newCol < m
                    && grid[newRow][newCol] == 1) {
                    if(newRow == p && newCol == q) {
                        return (cur.dest + 1); 
                    } else if(visited[newRow][newCol] == 0) {
                        Node child = new Node(newRow, newCol, cur.dest+1);
                        queue.add(child);
                        visited[newRow][newCol] = 1;
                    }
                }
            }
        }
        return -1;
    }
    
    static class Node {
        int i;
        int j;
        int dest;
        public Node(int i, int j, int dest) {
            this.i = i;
            this.j = j;
            this.dest = dest;
        }
    }
}
