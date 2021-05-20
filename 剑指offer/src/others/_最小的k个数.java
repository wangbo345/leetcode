package others;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/16
 * @description :
 */
public class _最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int[] s =new int[4];
        for (int i = 0; i < k; i++) {
            s[i] = arr[i];
        }
        return s;
    }
}
