package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/23
 * @description :
 */
public class _股票的最大利润 {
    /**
     * 穷举法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int maxSum=0;
        for (int i = 0; i < prices.length-1; i++) {
            int temp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                temp = Math.max(prices[j], temp);
            }
            maxSum = Math.max(temp - prices[i], maxSum);
        }
        return maxSum;
    }

}
