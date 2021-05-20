package others;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/17
 * @description :
 */
public class _第一个只出现一次的字符 {
    public static void main(String[] args) {
        firstUniqChar1("leetcode");
    }
    //借鉴别人的
    public static char firstUniqChar1(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])==null) {
                map.put(chars[i],1);
            }
            else {
                Integer value=map.get(chars[i]);
                map.put(chars[i],++value);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return chars[i];
            }
        }
        return ' ';
    }
    //自己写的超出时间限制
    public char firstUniqChar(String s) {
        if ("".equals(s)) {
            return 32;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int i1 = 0; i1 < chars.length; i1++) {
                if (chars[i1] == chars[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return chars[i];
            }
        }
        return 'a';
    }
}
