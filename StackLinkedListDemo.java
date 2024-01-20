package ADS_24_May_2023;

public class StackLinkedListDemo {

    static class Node {
        int element;
        Node next;
        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node top;
    private int size;

    public StackLinkedListDemo() {
        top = null;
        size = 0;
    }

    public int length() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public void push(int e)
    {
        Node newest = new Node(e, null);
        if (!isEmpty()) {
            newest.next = top;
        }
        top = newest;
        size = size + 1;
    }

    public int pop()
    {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int e = top.element;
        top = top.next;
        size = size - 1;
        return e;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.element;
    }

    public void display()
    {
        Node p = top;
        while(p!=null)
        {
            System.out.print(p.element + "-->");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedListDemo s = new StackLinkedListDemo();
        s.push(100);
        s.push(200);
        s.display();
        System.out.println("size: " + s.length());
        System.out.println("Element Popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        System.out.println("Element Popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        s.push(300);
        s.push(400);
        s.display();
        System.out.println("Element Top: " + s.peek());
        s.display();
    }

}
