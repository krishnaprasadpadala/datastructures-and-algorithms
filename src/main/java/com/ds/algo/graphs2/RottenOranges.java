package com.ds.algo.graphs2;

import java.util.*;

public class RottenOranges {
    
    public static int isCompleteRotten(int[][] grid) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        int n = grid.length;
        int m = grid[0].length;
        
        int freshOrangesCnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) {
                    Node rottenNode = new Node(i, j);
                    queue.add(rottenNode);
                }
                else if(grid[i][j] == 1) {
                    freshOrangesCnt++;
                }
            }
        }
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int[][] rowsAndCols = {{0,-1},{0,1},{-1,0},{1,0}};
            for (int[] rowsAndCol : rowsAndCols) {
                int newRow = node.i + rowsAndCol[0];
                int newCol = node.j + rowsAndCol[1];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && grid[newRow][newCol] == 1) {
                    freshOrangesCnt--;
                    grid[newRow][newCol] = 2;
                    queue.add(new Node(newRow, newCol));
                }
            }
        }
        return (freshOrangesCnt == 0) ? 1 : -1;
    }
    
    static class Node {
        int i;
        int j;
        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
