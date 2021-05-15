package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/15
 * @description :
 */
public class _二进制中1的个数 {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        int i = hammingWeight(n);
        System.out.println(i);
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int res = 0;
        while(n != 0) {
            if ((n&1)==1){
                res++;
            }
            n >>>= 1;
        }
        return res;
    }
}
