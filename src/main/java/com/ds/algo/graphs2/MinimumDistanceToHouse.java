package com.ds.algo.graphs2;

import java.util.*;

public class MinimumDistanceToHouse {
    
    // Iterate over all the hospitals and insert them into queue with dest=0
    // For every node in queue navigate to adjacent cells and mark their distance by increamenting by 1 in result array from src
            // and them to queue.
    // Do the same thing until the queue is empty and finally return the grid
    
    public static int[][] shortestDistance(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] distanceGrid = new int[n][m];
        ArrayDeque<Node> queue = new ArrayDeque<>(n*m);
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 'H') {
                    Node hospital = new Node(i, j, 0);
                    queue.add(hospital);
                }
            }
        }
        
        int[][] rowsAndCols = {{0,-1}, {0,1}, {-1, 0}, {1, 0}};
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(int k=0; k<4; k++) {
                int newRow = node.i + rowsAndCols[k][0];
                int newCol = node.j + rowsAndCols[k][1];
                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                    && grid[newRow][newCol] == 'R' && distanceGrid[newRow][newCol] == 0) {
                    Node house = new Node(newRow, newCol, node.dest + 1);
                    queue.add(house);
                    distanceGrid[newRow][newCol] = node.dest + 1;
                }
            }
        }
        return distanceGrid;
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
