package com.ds.algo.graphs2;

public class ConflictedArea {
    
    
    public static char[][] conflictedAreaAfterRecovery(char[][] map) {
        
        // implement the mark non-recoverable land
        int n = map.length;
        int m = map[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if((i==0 || i == (n-1) || j==0 || j == (m-1)) && map[i][j] == 'P') {
                    markNonRecoverableLand(map, i, j, n, m);
                }
            }
        }
        // capture the occupied land
        markLand(map, n, m, 'P', 'I');
        
        // un mark non-recoverable land
        markLand(map, n, m, '-', 'P');
        
        return map;
    }
    
    private static void markNonRecoverableLand(char[][] map, int i, int j, int n, int m) {
        map[i][j] = '-';
        int[][] rowsAndCols = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        for(int k=0; k<4; k++) {
            int newRow = i + rowsAndCols[k][0];
            int newCol = j + rowsAndCols[k][1];
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                && map[newRow][newCol] == 'P') {
                markNonRecoverableLand(map, newRow, newCol, n, m);
            }
        }
    }
    
    private static void markLand(char[][] map, int n, int m, char prev, char curr) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == prev) {
                    map[i][j] = curr;
                }
            }
        }
    }
}
