package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/6
 * @description :
 */
public class _在排序数组中查找数字i {
    public int search(int[] nums, int target) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count;
    }
}
