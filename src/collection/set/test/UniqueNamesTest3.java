package collection.set.test;


import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {


        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<inputArr.length;i++){
            set.add(inputArr[i]);
        }
        System.out.println(set);
    }

    



}
