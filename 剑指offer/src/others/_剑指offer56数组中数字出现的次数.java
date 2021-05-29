package others;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/22
 * @description :
 */
public class _剑指offer56数组中数字出现的次数 {
    /**
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] a=new int[2];
        int count=0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                a[count] = integerIntegerEntry.getKey();
                count++;
            }
        }
        return a;
    }
}
