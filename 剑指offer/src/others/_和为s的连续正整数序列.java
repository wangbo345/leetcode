package others;

import java.util.*;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/15
 * @description :
 */
public class _和为s的连续正整数序列 {
    public static void main(String[] args) {
        int[][] a = findContinuousSequence(9);
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                System.out.println(a[i][i1]);
            }
        }
    }
    public static int[][] findContinuousSequence(int target) {
        if (target == 1 || target == 2) {
            return new int[0][0];
        }
        int start=1;
        List<List<Integer>> lists=new ArrayList<>();
        while (start <= target/2) {
            int sum=0;
            List<Integer> list=new ArrayList<>();
            for (int i = start; i <= target/2+1; i++) {
                list.add(i);
                sum=sum+i;
                if (list.size() >= 2 && sum == target) {
                    lists.add(list);
                    break;
                }
                if (sum > target) {
                    break;
                }
            }
            start++;
        }
        int[][] f=new int[lists.size()][];
        int count=0;
        for (List<Integer> value : lists) {
            int[] a=new int[value.size()];
            for (int i = 0; i < value.size(); i++) {
                a[i]=value.get(i);
            }
            f[count]=a;
            count++;
        }
        return f;
    }
}
