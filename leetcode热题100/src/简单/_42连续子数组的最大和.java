package 简单;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/17
 * @description :
 */
public class _42连续子数组的最大和 {
    //动态规划
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] dp=new int[nums.length];//用来存储以每一个数字结尾的最大值
        dp[0]=nums[0];//以第一个数结尾的连续数组的最大值
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1] > 0) {
                dp[i]=dp[i-1]+nums[i];
            }
            else {
                dp[i]=nums[i];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    //暴力解法
    public int maxSubArray1(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp=0;
                for (int k = i; k <= j; k++) {
                    temp=temp+nums[k];
                }
                max=Math.max(max,temp);
            }
        }
        return max;
    }
}
