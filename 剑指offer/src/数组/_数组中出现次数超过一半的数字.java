package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/16
 * @description :
 */
public class _数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        for (int i = 0; i <= nums.length/2; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
