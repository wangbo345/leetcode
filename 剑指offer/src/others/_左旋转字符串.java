package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/15
 * @description :
 */
public class _左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder stringBuilder1=new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < n) {
                stringBuilder.append(chars[i]);
            }
            else {
                stringBuilder1.append(chars[i]);
            }
        }
        return stringBuilder1.append(stringBuilder).toString();
    }
}
