package others;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/21
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        say();
        Integer integer=12344;
        Integer integer1=12344;
        String name = "通话";
        String name1 = "重地";
        Map<String,Integer> map1=new HashMap<>();
        map1.put(name, 1);
        map1.put(name1, 2);
        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "-------" + stringIntegerEntry.getValue());
        }
        System.out.println(name.hashCode() + "------" + name1.hashCode());
        Map<Integer ,Integer> map=new HashMap<>();
        map.put(integer, 1);
        map.put(integer1, 2);
        map.put(1234, 2);
        map.put(null, 2);
        map.put(null, 3);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey()+"------"+integerIntegerEntry.getValue());
        }
    }
    static void say(){
        int h;
        System.out.println((h=1)^(h >>> 16));
    }
}
