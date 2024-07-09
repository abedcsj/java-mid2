package collection.list;

public class MyLinkedList<E>implements MyList<E> {
    private Node<E> first;
    private int size=0;
@Override
    public void add(E e) {
        Node<E> newNode = new Node(e);
        if(first==null) {
            first = newNode;
        }else{
            Node<E> lastNode=getLastNode();
            lastNode.next=newNode;
        }
        size++;

    }
    private  Node<E> getLastNode(){
        Node<E> x=first;
        while(x.next!=null){
            x=x.next;
        }
        return x;
    }

    //추가코드
    @Override
    public void add(int index,E e){
        Node<E> newNode=new Node<E>(e);
        if(index==0){
            newNode.next=first;
        }else{
            Node<E> prev=getNode(index-1);
            newNode.next=prev.next;
            prev.next=newNode;
        }
        size++;
    }

    //추가코드
    @Override
    public E remove(int index){
        Node<E> removeNode=getNode(index);
        E removedItem=removeNode.item;
        if(index==0){
            first=removeNode.next;
        }else{
            Node prev=getNode(index-1);
            prev.next=removeNode.next;
        }
        removeNode.next=null;
        removeNode.item=null;
        size--;
        return removedItem;
    }

    @Override
    public E set(int index,E e) {
        Node<E> x=getNode(index);
        E oldValue=x.item;
        x.item=e;
        return oldValue;


    }

    @Override
    public E get(int index){
        Node<E> node=getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x=first;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;
    }
    @Override
    public int indexOf(Object e) {
        int index=0;
        for(Node<E> x=first;x!=null;x=x.next){
            if(e.equals(x.item)){
                return index;
            }else {
                index++;
            }
        }
        return -1; // 못 찾았을 경우
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
    private static class Node<E>{
        E item;
       Node<E> next;

        public Node(E item){
            this.item=item;
        }



        @Override
        public String toString() {
            String sb=new String();
            Node<E> x=this;
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
}
