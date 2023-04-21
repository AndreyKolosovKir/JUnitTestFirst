public class Stack {
    protected Node head = null;

    public Node push(String value) {
        Node newNode;
        if (head == null) {
            newNode = new Node(value, null);
            head = newNode;
            return head;
        } else {
            newNode = new Node(value, head);
            head = newNode;
            return head;
        }
    }

    public String pop() {
        if (head != null) {
            String value = head.value;
            head = head.prev;
            return value;
        }
        return "нет элементов";
    }

    public void printMe() {
        Node node;
        if (head == null) {
            System.out.print("EMPTY");
        } else {
            node = head;
            while (node != null) {
                System.out.print(node.value);
                if (node.prev != null) {
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
        }
        System.out.println();
    }
}
