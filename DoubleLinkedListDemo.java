package ADS_24_May_2023;

public class DoubleLinkedListDemo {

    static class Node {
        int element;
        Node next;
        Node prev;
        public Node(int e, Node n, Node p)
        {
            element = e;
            next = n;
            prev = p;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedListDemo() {
        head = null;
        tail = null;
        size = 0;
    }
    public int length() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public void insertLast(int e) {
        Node newest = new Node(e, null, null);
        if(isEmpty()) {
            head = newest;
        }
        else {
            tail.next = newest;
            newest.prev = tail;
        }
        tail = newest;
        size = size + 1;
    }
public void insertFirst(int e) {
    Node newest = new Node(e, null, null);
    if(isEmpty()) {
        head = newest;
        tail = newest;
    }
    else {
        newest.next = head;
        head.prev = newest;
        head = newest;
    }
    size = size + 1;
}
public void insertPosition(int e, int position) {
    if(position <= 0 || position >= size) {
        System.out.println("Invalid Position");
        return;
    }
    Node newest = new Node(e, null, null);
    Node p = head;
    int i = 1;
    while(i < position-1) {
        p = p.next;
        i = i + 1;
    }
    newest.next = p.next;
    p.next.prev = newest;
    p.next = newest;
    newest.prev = p;
    size = size + 1;
}
public int deleteFirst() {
    if(isEmpty()) {
        System.out.println("Doubly List is Empty");
        return -1;
    }
    int e = head.element;
    head = head.next;
    size = size - 1;
    if(isEmpty())
        tail = null;
    else
        head.prev = null;
    return e;
}
public int deleteLast() {
    if(isEmpty()) {
        System.out.println("Doubly List is Empty");
        return -1;
    }
    int e = tail.element;
    tail = tail.prev;
    tail.next = null;
    size = size - 1;
    return e;
}
public int deletePosition(int position) {
    if(position <= 0 || position >= size-1) {
        System.out.println("Invalid Position");
        return -1;
    }
    Node p = head;
    int i = 1;
    while(i < position-1) {
        p = p.next;
        i = i + 1;
    }
    int e = p.next.element;
    p.next = p.next.next;
    p.next.prev = p;
    size = size - 1;
    return e;
}

public void display() {
        Node p = head;
        while(p!=null) {
            System.out.print(p.element + "-->");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedListDemo l = new DoubleLinkedListDemo();
        int element;
        l.insertLast(100);
        l.insertLast(200);
        l.insertLast(300);
        l.insertLast(400);
        l.insertLast(500);
        l.display();
        System.out.println("Size: " + l.length());
        l.insertFirst(50);
        l.insertFirst(10);
        l.display();
        System.out.println("Size: " + l.length());
        l.insertPosition(75, 3);
        l.display();
        System.out.println("Size: " + l.length());
        element = l.deleteFirst();
        System.out.println("Deleted Element: " + element);
        l.display();
        System.out.println("Size: " + l.length());
        element = l.deleteLast();
        System.out.println("Deleted Element: " + element);
        l.display();
        System.out.println("Size: " + l.length());
        element = l.deletePosition(3);
        System.out.println("Deleted Element: " + element);
        l.display();
        System.out.println("Size: " + l.length());

    }
}


