package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/11
 * @description :
 */
public class _青蛙跳台阶问题 {
    public int numWays(int n) {
        if (n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int first=1;
        int second=2;
        int sum=0;
        for (int i=3;i<=n;i++){
            sum=(first+second)%1000000007;
            first=second;
            second=sum;
        }
        return sum;
    }
}
