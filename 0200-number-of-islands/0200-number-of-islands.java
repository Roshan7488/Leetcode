class Solution {
    public void bfsTraversal(char[][] grid, int r, int c,int[][] dirs) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { r, c });
        grid[r][c] = '0';
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.remove();
                int cR = curr[0],
                        cC = curr[1];
                for (int[] dir : dirs) {
                    int nR = cR + dir[0],
                            nC = cC + dir[1];
                    if (nR >= grid.length) {
                        continue;
                    }
                    if (nC >= grid[0].length) {
                        continue;
                    }
                    if (nR < 0) {
                        continue;
                    }
                    if (nC < 0) {
                        continue;
                    }
                    if (grid[nR][nC] == '0') {
                        continue;
                    }
                    grid[nR][nC] = '0';
                    queue.add(new int[] { nR, nC });
                }
            }

        }
    }

    public int numIslands(char[][] grid) {
        int countIsland=0;
        int[][] dirs={
            {0,1},//right
            {1,0},//bottom
            {0,-1},//left
            {-1,0}//top
        };
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    countIsland+=1;
                    bfsTraversal(grid,i,j,dirs);
                }
            }
        }
        return countIsland;
    }
}