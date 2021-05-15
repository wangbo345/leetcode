package 数组;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/5
 * @description :
 */
public class _二维数组中的查找 {

    public static void main(String[] args) {

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        int x=matrix.length-1;
        int y=0;
        while(x>=0&&y<matrix[0].length){
            if(target<matrix[x][y]){
                x--;
            }
            else if(target>matrix[x][y]){
                y++;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
