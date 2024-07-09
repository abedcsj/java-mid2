package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("AddLast");
        list.add(3,"addList");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"addFirst");
        System.out.println(list);

        Object removeLast = list.remove(4);
        System.out.println("remove(4)= "+removeLast);
        System.out.println(list);

        Object removeFirst=list.remove(0);
        System.out.println("remove(0)="+removeFirst);
        System.out.println(list);


    }
}
