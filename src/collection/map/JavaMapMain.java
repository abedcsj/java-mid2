package collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new TreeMap<>());
        run(new LinkedHashMap<>());

    }

    private static void run(Map<String,Integer> map) {
        System.out.println("map = " + map);
        map.put("C",10);
        map.put("A",20);
        map.put("D",30);
        map.put("1",40);
        map.put("2",50);

        Set<String> keyset=map.keySet();
        Iterator<String> iterator=keyset.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println();
    }
}
