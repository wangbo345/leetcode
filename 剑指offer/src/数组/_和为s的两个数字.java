package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/16
 * @description :
 */
public class _和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int sum=0;
        while (i < j) {
            sum=nums[i]+nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            }
            else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
