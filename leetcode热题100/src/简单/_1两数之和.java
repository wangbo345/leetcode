package 简单;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/17
 * @description :
 */
public class _1两数之和 {
    //使用查找表
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    //暴力求解
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
