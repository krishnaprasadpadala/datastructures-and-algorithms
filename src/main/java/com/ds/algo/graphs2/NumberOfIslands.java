package com.ds.algo.graphs2;

public class NumberOfIslands {
    
    // Initialise the count variable
    // for every cell do the dfs if it is not visited and if it is not 0
    // use the same array to change the 1 --> 0 
    
    public static int count(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private static void dfs(int[][] grid, int i, int j) {
        grid[i][j] = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] rowsAndCols = {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        for(int[] rowAndCol : rowsAndCols) {
            int newRow = i + rowAndCol[0];
            int newCol = j + rowAndCol[1];
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m 
                    && grid[newRow][newCol] == 1) {
                dfs(grid, newRow, newCol);
            }
        }
    }
    
    
    
    
}
