package collection.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String,Integer> studentMap = new HashMap<>();

        studentMap.put("studentA",90);
        //System.out.println(studentMap);
        //같은 key값에 다른 value를 넣으면 마지막에 넣은 value값으로 바뀜
        studentMap.put("studentA",100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey: "+containsKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
