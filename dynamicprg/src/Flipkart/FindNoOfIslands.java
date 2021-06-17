package Flipkart;

public class FindNoOfIslands {
    public int findIslands(int[][] grid){
        if(grid==null||grid.length==0)
            return 0;
        int numOfIslands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    bfs(grid,i,j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }

    private void bfs(int[][] grid, int i, int j) {
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==0)
            return;
        grid[i][j]=0;
        bfs(grid,i+1,j);
        bfs(grid,i-1,j);
        bfs(grid,i,j-1);
        bfs(grid,i,j+1);
    }

}
