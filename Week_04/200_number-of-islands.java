// dfs
class Solution {
    public int numIslands(char[][] grid) {
        int col =  grid.length;
        if (col == 0 ) {
            return 0;
        }
        int row =  grid[0].length;
        boolean[][] mark = new boolean[col][row];
        int count = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if ('1' == grid[i][j]) {
                    count++;
                    dfs(i, j, col, row, mark, grid);
                }
            }
        }
        return count;
    }

    public void dfs(int x, int y, int col, int row, boolean[][] mark, char[][] grid) {
        if (x < 0 || y < 0 || x >= col || y >= row || mark[x][y] == true || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = 0;
        mark[x][y] = true;
        dfs(x + 1, y, col, row, mark, grid);
        dfs(x - 1, y, col, row, mark, grid);
        dfs(x, y + 1, col, row, mark, grid);
        dfs(x, y - 1, col, row, mark, grid);
    }
}
// bfs
import java.util.LinkedList;
import java.util.Queue;

class Solution1 {
    private int[][] nums = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int row =  grid.length;
        if (row == 0 ) {
            return 0;
        }
        int col =  grid[0].length;
        boolean[][] mark = new boolean[row][col];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!mark[i][j] && '1' == grid[i][j]) {
                    count++;
                    mark[i][j] = true;
                    grid[i][j] = '0';
                    Queue<Integer> queue= new LinkedList<>();
                    queue.add(col * i + j);
                    while(!queue.isEmpty()) {
                        int value = queue.poll();
                        int x = value / col;
                        int y = value % col;
                        for (int k = 0; k < nums.length; k++) {
                            int newX = x + nums[k][0];
                            int newY = y + nums[k][1];
                            if (newX >= 0 && newX < row && newY >= 0 && newY < col
                                    && grid[newX][newY] == '1' && !mark[newX][newY]) {
                                queue.add(newX * col + newY);
                                mark[newX][newY] = true;
                                grid[newX][newY] = '0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
