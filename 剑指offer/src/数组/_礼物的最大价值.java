package 数组;

import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/23
 * @description :动态规划解决
 */
public class _礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] dp = new int[x][y];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //左边的值
                int a = ((i - 1) >= 0 ? dp[i - 1][j] : 0);
                //右边的值
                int b = ((j - 1) >= 0 ? dp[i][j - 1] : 0);
                dp[i][j] = Math.max(a, b) + grid[i][j];
            }
        }
        return grid[x - 1][y - 1];
    }
}
