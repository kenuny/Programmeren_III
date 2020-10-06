package domein;

public class Node{

    private final String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public final void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
