package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/13
 * @description :
 */
public class _反转单词顺序 {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String[] s1 = s.split("\\s+");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=s1.length-1;i>=0;i--){
                stringBuilder.append(s1[i] + " ");
        }
        return stringBuilder.toString().trim();
    }
}
