package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set=new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        set.add(4);
        System.out.println(set);
        System.out.println(set.add(4));

    }
}
