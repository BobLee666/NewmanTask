package minpathsum;

class Solution {
    public int minPathSum(int[][] grid) {
        int pathsum[][] = new int[grid.length][grid[0].length];
        pathsum[0][0] = grid[0][0];
        for(int i = 1; i < grid.length; i++){
            pathsum[i][0] =  pathsum[i - 1][0] + grid[i][0];
        }
        for(int i = 1; i < grid[0].length; i++){
            pathsum[0][i] =  pathsum[0][i - 1] + grid[0][i];
        }
        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                pathsum[i][j] = Math.min(pathsum[i - 1][j],pathsum[i][j - 1])+ grid[i][j];
            }
        }
        return pathsum[grid.length - 1][grid[0].length - 1];
    }
}
