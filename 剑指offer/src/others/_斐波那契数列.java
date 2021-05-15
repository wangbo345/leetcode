package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/9
 * @description :
 */
public class _斐波那契数列 {
    public static void main(String[] args) {
        long fib = fib(15);
        System.out.println(fib);
        int i = fib1(15);
        System.out.println(i);
    }
    public static long fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        long first=1;
        long second=1;
        long sum=0;
        for (int i = 3; i <= n; i++) {
            sum=(first+second)%1000000007;
            first=second;
            second=sum;
        }
        return sum;

    }
    public static int fib1(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
