package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {


        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<inputArr.length;i++){
            set.add(inputArr[i]);
        }
        System.out.println(set);
    }





}
