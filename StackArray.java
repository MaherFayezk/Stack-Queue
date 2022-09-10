import java.util.ArrayList;

public class StackArray<E> {
    ArrayList<E> stack;
    int length;

    public StackArray() {
        this.stack = new ArrayList<>();
        this.length = 0;
    }

    public E peek() {
        return this.length == 0 ? null : this.stack.get(this.length - 1);
    }

    public E pop() {
        if (this.length == 0) {
            return null;
        }
        this.length--;
        return this.stack.get(this.length);
    }

    public void push(E value) {
        this.stack.add(value);
        this.length++;
    }

    public boolean isEmpty() {
        return this.length == 0 ? true : false;
    }
}
