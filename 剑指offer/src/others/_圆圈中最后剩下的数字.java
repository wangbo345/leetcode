package others;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/16
 * @description :
 */
public class _圆圈中最后剩下的数字 {
    /**
     * 约瑟夫环
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int current=0;
        while (list.size() > 1) {
           current=(current+m-1)%list.size();
            list.remove(current);;
        }
        return list.get(0);
    }

}
