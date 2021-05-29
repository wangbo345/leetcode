package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/24
 * @description :
 */
public class _构建乘积数组 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
    }
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return null;
        }
        //先遍历下半角
        int[] c = new int[a.length];
        c[0] = 1;
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] * a[i - 1];
        }
        int[] d = new int[a.length];
        d[d.length - 1] = 1;
        for (int i = d.length-2; i>=0; i--) {
            d[i] = d[i + 1] * a[i + 1];
        }
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = c[i] * d[i];
        }
        return b;
    }
    //暴力求解,超出时间限制
    public int[] constructArr1(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = multiply(a, i);
        }
        return b;
    }

    //计算出数组中除某一个特定数字外其他数字的乘积
    public  int multiply(int[] a, int index) {
        int sum=1;
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                continue;
            }
            sum *= a[i];
        }
        return sum;
    }
}
