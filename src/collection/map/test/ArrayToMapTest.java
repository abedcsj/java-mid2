package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][]productArr={{"Java","10000"},{"spring","20000"},{"Jpa","30000"}};
        Map<String,Integer>productMap=new HashMap<String,Integer>();
        for (String[]product : productArr) {;
            String key=product[0];
            String value=product[1];
            productMap.put(key,Integer.valueOf(value));
        }

        System.out.println(productMap);
    }
}
