package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/22
 * @description :
 */
public class _不用加减乘除做加法 {
    public static void main(String[] args) {

    }
    public int add(int a, int b) {
        //相加各位的值不算进位
        int x = a ^ b;
       //计算进位值,先将两个数做与操作再向左移一位
        int y = (a & b) << 1;
        if (y == 0) {
            return x;
        }
        while (y != 0) {
            int temp = x;
            x = x ^ y;
            y = (temp & y) << 1;
        }
        return x;

    }
}
