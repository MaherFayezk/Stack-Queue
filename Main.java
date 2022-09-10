import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack<String> myStck = new Stack<String>();
        // myStck.push("1");
        // myStck.push("2");
        // myStck.push("3");
        // myStck.push("4");

        // System.out.println(myStck.isEmpty());

        // System.out.println(myStck.peek());
        // System.out.println(myStck.pop());
        // System.out.println(myStck.pop());
        // System.out.println(myStck.pop());
        // System.out.println(myStck.pop());
        // System.out.println(myStck.pop());
        // System.out.println(myStck.peek());

        // System.out.println(myStck.isEmpty());

        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());

        myQueue.push(5);

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}

class MyQueue {
    Stack<Integer> stack;
    HashMap<Integer, Integer> map;

    public MyQueue() {
        this.stack = new Stack<Integer>();
        this.map = new HashMap<Integer, Integer>();
    }

    public void push(int x) {
        int stackSize = this.stack.size();
        this.stack.push(stackSize);
        map.put(stackSize, x);
    }

    public int pop() {
        int key = this.stack.pop() - this.stack.size();
        return this.map.get(key);
    }

    public int peek() {
        return this.map.get(0);
    }

    public boolean empty() {
        return this.stack.empty();
    }
}
