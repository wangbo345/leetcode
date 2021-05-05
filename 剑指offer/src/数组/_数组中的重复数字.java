package 数组;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/5
 * @description :
 */
public class _数组中的重复数字 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (Integer x:nums){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }
}
