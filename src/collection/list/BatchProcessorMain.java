package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyLinkedList<Integer>list=new MyLinkedList<>();

        BatchProcessor batchProcessor=new BatchProcessor(list);
        batchProcessor.logic(50000);
        System.out.println(list);
    }
}
