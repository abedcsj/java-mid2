package collection.set.member;



public class JavaHashCodeMain {
    public static void main(String[] args) {


        Integer i = 10;
        String strA = "A";
        String strB = "B";
        String strAB="AB";



        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strB.hashCode());
        System.out.println(strAB.hashCode());


        Member member1=new Member("idA");
        Member member2=new Member("idA");

        System.out.println((member1==member2));
        System.out.println((member1.equals(member2)));
    }
}
