package collection.link;

public class Node {
    Object item ;
    Node next ;

    public Node(Object item){
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if(x.next != null ){
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }



    public Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next ;
        }
        return x;
    }

    public Node getLastNode(Node node){
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    public void add(Node node, String param){
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    public void printAll(Node node) {
        Node x = node;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
