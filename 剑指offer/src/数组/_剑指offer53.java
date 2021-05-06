package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/6
 * @description :
 * 题目链接:https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class _剑指offer53 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
