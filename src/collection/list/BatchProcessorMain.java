package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // 크기: 50000, 계산 시간: 1493ms
        // MyArrayList<Integer> list = new MyArrayList<>();

        // 크기: 50000, 계산 시간: 3ms
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
