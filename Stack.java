public class Stack<T> {
    Node<T> top;
    Node<T> buttom;
    int length;

    public Stack() {
        this.top = null;
        this.buttom = null;
        this.length = 0;
    }

    public T peek() {
        if (this.length == 0) {
            return null;
        }
        return this.top.getValue();
    }

    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        if (this.length == 0) {
            this.top = newNode;
            this.buttom = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.length++;
    }

    public T pop() {
        if (this.length == 0) {
            this.buttom = null;
            return null;
        }
        Node<T> currentTop = this.top;
        this.top = this.top.next;
        this.length--;
        return currentTop.getValue();
    }

    public boolean isEmpty() {
        return this.length == 0 ? true : false;
    }
}