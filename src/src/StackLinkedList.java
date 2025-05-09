public class StackLinkedList implements Stack{

    StackItem top;
    

    @Override
    public void push(Object o) {
        StackItem si = new StackItem(o);
        si.setNext(this.top);
        top = si;
    }

    @Override
    public Object pop() {
        Object o = top.getData();
        top = top.getNext();
        return o;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + this.top.getData());
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
