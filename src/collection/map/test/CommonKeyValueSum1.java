package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b",4);
        map2.put("c",5);
        map2.put("d",6);

        Map<String, Integer> result = new HashMap<>();
        for (String s : map1.keySet()) {
            if(map2.containsKey(s)) {
                result.put(s,map1.get(s)+map2.get(s));
            }
        }
        System.out.println(result);

    }
}
