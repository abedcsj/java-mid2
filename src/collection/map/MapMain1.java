package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap=new HashMap<>();


        studentMap.put("student1",90);
        studentMap.put("student2",80);
        studentMap.put("student3",70);
        studentMap.put("student4",60);
        studentMap.put("student5",50);
        System.out.println(studentMap);

        int result=studentMap.get("student5");
        System.out.println("result = "+result);

        System.out.println("KetSet 활용");
        Set<String> set=studentMap.keySet();
        for (String s : set) {
            Integer value=studentMap.get(s);
            System.out.println("Set = "+s+" , value = "+value);
            
        }
    }
}
