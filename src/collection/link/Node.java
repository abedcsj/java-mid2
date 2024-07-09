package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item){
        this.item=item;
    }

    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    @Override
    public String toString() {
       String sb=new String();
       Node x=this;
       System.out.print("[");
       while(x!=null){
           System.out.print(x.item);
           if(x.next!=null) {
               System.out.print("->");
           }
           x=x.next;
       }
        System.out.print("]");
       String string=sb.toString();
       return string;
    }
}

