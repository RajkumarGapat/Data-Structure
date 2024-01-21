package ADS_24_May_2023;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;
    private int size;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
        this.size = 0;
    }

    public int length() {

        return size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            arr[++top] = data;
        }
        size = size + 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            size = size - 1;
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();
        System.out.println("Size: "+stack.length());


        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.display();
        System.out.println("Size: "+stack.length());

    }
}