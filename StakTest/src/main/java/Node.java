public class Node {
    String value;
    Node prev;

    public Node(String value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public String toString (){
        return value + ", " + prev;
    }
}
