package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int capacity=10 ;

    public static void main(String[] args) {

        LinkedList<Integer>[]buckets=new LinkedList[capacity];
        System.out.println("buckets = "+ Arrays.toString(buckets));
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
        System.out.println("buckets = "+ Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);
        System.out.println("buckets = "+Arrays.toString(buckets));

        int searchValue=9;
        boolean result=contains(buckets,searchValue);
        System.out.println(result);



    }

    private static void add(LinkedList<Integer>[]buckets,int value){
        int hashIndex=hashIndex(value);
        LinkedList<Integer>bucket=buckets[hashIndex];
        if(!bucket.contains(value)){
            bucket.add(value);
        }
    }



    private static boolean contains(LinkedList<Integer>[]buckets,int searchValue){
        int hashIndex=hashIndex(searchValue);
        LinkedList<Integer>bucket=buckets[hashIndex];
        boolean contains=bucket.contains(searchValue);
        return contains;

    }


    static int hashIndex(int value){
        return value%capacity;
    }
}
