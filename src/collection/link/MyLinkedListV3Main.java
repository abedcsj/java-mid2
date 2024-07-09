package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> StringList=new MyLinkedListV3<String>();
        StringList.add("a");
        StringList.add("b");
        StringList.add("c");
        String string=StringList.get(0);
        System.out.println("String = "+string);

    }
}
