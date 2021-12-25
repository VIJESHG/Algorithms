class Solution {
    public void visit_neighbours(char[][] grid,int i,int j,int rows,int cols){
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != '1')
            return;
        
        grid[i][j] = '2';
        visit_neighbours(grid,i-1,j,rows,cols);
        visit_neighbours(grid,i,j-1,rows,cols);
        visit_neighbours(grid,i+1,j,rows,cols);
        visit_neighbours(grid,i,j+1,rows,cols);
    }
    public int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int i =0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    visit_neighbours(grid,i,j,rows,cols);
                }
            }
        }
        return islands;
    }
}