package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/22
 * @description :
 */
public class _剑指offer64 {
    /**
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
     * @param n
     * @return
     */
    public int sumNums(int n) {
        int sum=n;
        boolean flag = (n > 0) && (sum += sumNums(n - 1))>0;
        return sum;
    }
}
