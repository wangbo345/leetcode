package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/11
 * @description :
 */
public class _旋转数组的最小数字  {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i+1]<i){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
