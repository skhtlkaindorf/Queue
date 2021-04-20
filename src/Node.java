public class Node
{
    private final Integer zahl;

    private Node next;

    public Node(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
