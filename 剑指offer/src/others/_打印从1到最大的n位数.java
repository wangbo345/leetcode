package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/9
 * @description :
 */
public class _打印从1到最大的n位数 {
    public int[] printNumbers(int n) {
        int sum=1;
        for (int i = 0; i < n; i++) {
            sum=10*sum;
        }
        int[] a=new int[sum-1];
        for (int i = 1; i < sum; i++) {
            a[i-1]=i;
        }
        return a;

    }
}
