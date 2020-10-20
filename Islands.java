public class Islands {

    public static void main(String[] args){
        // int [][] grid = {{1,1,1,1,0},{1,1,0,1,0}, {1,1,0,0,0},{0,0,0,0}};
        int [][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,1,0},{0,0,0,1,1}};
        System.out.println("Number of islands " + method(grid));
    }

    // public static int method(String[] args){
    public static int method(int[][] grid){
        int count = 0;
        // int [][] grid = {{1,1,1,1,0},{1,1,0,1,0}, {1,1,0,0,0},{0,0,0,0}};

        for (int i = 0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                // System.out.println(grid[i][j]);
                if (grid[i][j] == 1){
                    count++;
                    // BFSmethod resultFromGrid = new BFSmethod();
                    // resultFromGrid.callBFS(grid, i, j);
                    callBFS2(grid, i, j);

                }

            }
        }
        return count;
    }

    public static void callBFS2(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j<0 || j >= grid[i].length || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        callBFS2(grid, i+1, j);   
        callBFS2(grid, i-1, j);   
        callBFS2(grid, i, j+1);   
        callBFS2(grid, i, j-1);   

    }
    
}