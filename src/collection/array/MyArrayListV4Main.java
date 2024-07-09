package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList=new MyArrayListV4<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        String string=stringList.get(0);
        System.out.println("string= "+string);
        System.out.println(stringList);

        MyArrayListV4<Integer> integerList=new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer=integerList.get(0);
        System.out.println("integer= "+integer);
        System.out.println(integerList);
    }
}
