package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next  = new Node("B");
        first.next.next  = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색
        System.out.println("모든 노드 탐색하기");
        first.printAll(first);

        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = first.getLastNode(first);
        System.out.println("last Node = " + lastNode);

        // 툭종 index의 노드 조회하기
        int index = 2;
        Node index2Node = first.getNode(first,index);
        System.out.println("index의 노드 조회하기 = " + index2Node);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        first.add(first,"D");
        System.out.println(first);
        first.add(first,"E");
        System.out.println(first);
        first.add(first,"F");
        System.out.println(first);
    }
}
