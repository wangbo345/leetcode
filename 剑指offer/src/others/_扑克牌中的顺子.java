package others;

import java.util.Arrays;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/22
 * @description :
 */
public class _扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        int sumZero=0;
        for (int num : nums) {
            if (num == 0) {
                sumZero++;
            }
        }
        Arrays.sort(nums);
        for (int i = sumZero; i < nums.length-1; i++) {
            if (nums[i + 1] - nums[i]>1) {
                int temp=nums[i + 1] - nums[i]-1;
                sumZero=sumZero-temp;
            }
            if (nums[i + 1] - nums[i] == 0) {
                return false;
            }
        }
        if (sumZero < 0) {
            return false;
        } else {
            return true;
        }

    }
}
