package others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/13
 * @description :
 */
public class _调整数组顺序使奇数位于偶数的前面 {
    public int[] exchange(int[] nums) {
        if (nums.length==0){
            return new int[0];
        }
        List<Integer> listJ = new ArrayList<>();
        List<Integer> listO = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                listO.add(nums[i]);
            }
            else {
                listJ.add(nums[i]);
            }
        }
        listJ.addAll(listO);
        for (int i = 0; i < nums.length; i++) {
            nums[i]=listJ.get(i);
        }
        return nums;

        }
    }

