package others;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/21
 * @description :
 */
public class _数组中数字出现的次数 {
    public static void main(String[] args) {
        int[] a=new int[]{1255,1255,1255,1433};
        int[] a1=new int[]{3,4,3,3};
        int i = singleNumber(a);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                return integerIntegerEntry.getKey();
            }
        }
        return -1;
    }
}
