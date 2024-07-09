package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first=new Node("A");
        first.next=new Node("B");
        first.next.next=new Node("C");
        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        Node lastNode=getLastNode(first);
        System.out.println("마지막 노드 구하기");
        System.out.println(lastNode);

        int index=2;
        Node get2Node=getNode(first,index);
        System.out.println("index2노드 값 구하기");
        System.out.println(get2Node);


        System.out.println("데이터 추가하기");
        add(first,"D");
        System.out.println(first);


    }

    private static void add(Node node,Object item){
        Node lastNode=getLastNode(node);
        lastNode.next=new Node(item);
    }

    private static Node getNode(Node node,int index){
        Node x=node;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;

    }
    private static Node getLastNode(Node node) {
        while(node.next!=null){
            node=node.next;
        }
        return node;
    }

    public static void printAll(Node node){
        Node x=node;
        while(x!=null){
            System.out.println(x.item);
            x=x.next;
        }
    }
}
