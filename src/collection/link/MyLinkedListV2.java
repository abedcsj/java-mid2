package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size=0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if(first==null) {
            first = newNode;
        }else{
            Node lastNode=getLastNode();
            lastNode.next=newNode;
        }
        size++;

    }
    private  Node getLastNode(){
        Node x=first;
        while(x.next!=null){
            x=x.next;
        }
        return x;
    }

    //추가코드

    public void add(int index,Object e){
        Node newNode=new Node(e);
        if(index==0){
            newNode.next=first;
        }else{
            Node prev=getNode(index-1);
            newNode.next=prev.next;
            prev.next=newNode;
        }
        size++;
    }

    //추가코드
    public Object remove(int index){
        Node removeNode=getNode(index);
        Object removedItem=removeNode.item;
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

    public Object set(int index,Object e) {
        Node x=getNode(index);
        Object oldValue=x.item;
        x.item=e;
        return oldValue;


    }

    public Object get(int index){
        Node node=getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x=first;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;
    }
    public int indexOf(Object e) {
        int index=0;
        for(Node x=first;x!=null;x=x.next){
            if(e.equals(x.item)){
                return index;
            }else {
                index++;
            }
        }
        return -1; // 못 찾았을 경우
    }

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
}
