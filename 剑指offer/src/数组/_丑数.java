package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/23
 * @description :
 */
public class _丑数 {
    public static void main(String[] args) {
        int i = nthUglyNumber1(10);
        System.out.println(i);
    }
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] uglyArr = new int[n];
        uglyArr[0]=1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < uglyArr.length; i++) {
            int lastUgly = uglyArr[i - 1];
            while (lastUgly >= uglyArr[p2] * 2) {
                p2++;
            }
            while (lastUgly >= uglyArr[p3] * 3) {
                p3++;
            }
            while (lastUgly >= uglyArr[p5] * 5) {
                p5++;
            }
            uglyArr[i] = Math.min(uglyArr[p2], Math.min(uglyArr[p3], uglyArr[p5]));
        }
        return uglyArr[n - 1];
    }
    /**
     * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     * @param n
     * @return
     * 穷举法,时间复杂度过高
     */
    public static int nthUglyNumber1(int n) {
        int count=0;
        int i = 1;
        while (count < n) {
            if (isUgly(i)) {
                count++;
            }
            i++;
        }
        return --i;
    }

    /**
     * 判断一个数是不是丑数(穷举)
     * @param number
     * @return
     */
    public static boolean isUgly(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }
        return number == 1 ? true : false;
    }
}





















































