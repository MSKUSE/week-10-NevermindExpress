import java.util.ArrayList;
public class StackArray implements Stack {

    private ArrayList<Object> stack = new ArrayList<Object>();

    @Override
    public void push(Object o) {
        stack.addFirst(o);
    }

    @Override
    public Object pop() {
        return stack.removeFirst();
    }

    @Override
    public void peek() {
        System.out.println("The top is " + stack.getFirst());
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
