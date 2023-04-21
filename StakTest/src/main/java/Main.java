public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String[] count = {"0", "1", "2", "3", "4", "5"};
        stack.printMe();
        for (int i = 0; i < count.length; i++) {
            System.out.println("Добавим " + count[i]);
            stack.push(count[i]);
            stack.printMe();
        }
        for (int j = 0; j < count.length; j++) {
            System.out.println("Снимем со стека");
            System.out.println(stack.pop());
            stack.printMe();
        }
    }
}
