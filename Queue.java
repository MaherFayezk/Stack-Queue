public class Queue<E> {
    Node<E> first;
    Node<E> last;
    int length;

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public E peek() {
        return this.first.getValue();
    }

    public E dequeue() {
        if (this.length == 0) {
            return null;
        }
        Node<E> currentFirst = this.first;
        this.first = this.first.previous;
        return currentFirst.getValue();
    }

    public void enqueue(E value) {
        Node<E> newNode = new Node<E>(value);
        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.previous = newNode;
            newNode.next = this.last;
            this.last = newNode;
        }
        // System.out.println("last vaue: " + this.last.getValue());
        this.length++;
    }
}
