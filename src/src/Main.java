public class Main {
    public static void main(String[] args) {
        Stack s = new StackLinkedList();
        s.push("This is a string.");
        s.push(5);
        s.peek();
        System.out.println("Is empty " + s.isEmpty());
        System.out.println("Pop = " + s.pop());
        s.peek();
    }
}