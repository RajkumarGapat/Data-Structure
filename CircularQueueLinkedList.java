package ADS_24_May_2023;

public class CircularQueueLinkedList<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;
    private int capacity;

    public CircularQueueLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }

    public int length() {

        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Circular queue is full. Cannot enqueue element: " + data);
            return;
        }

        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        rear.next = front; 
        size++;
        
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Circular queue is empty. Cannot dequeue element.");
            return null;
        }

        T dequeuedElement = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front; 
        }

        size--;
        
        return dequeuedElement;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Circular queue is empty.");
            return;
        }

        Node<T> current = front;
        System.out.print("Circular Queue: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != front);
        System.out.println();
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CircularQueueLinkedList<Integer> queue = new CircularQueueLinkedList<>(5);
        System.out.println("enqueue Element : ");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
         System.out.println("Size: "+queue.length()+"\n");

         System.out.println("dequeue Element : ");

        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
        System.out.println("Size: "+queue.length()+"\n");

        System.out.println("enqueue Element : ");

        queue.enqueue(5);
        queue.enqueue(6);
        queue.displayQueue();
        System.out.println("Size: "+queue.length()+"\n");

        System.out.println("dequeue Element : ");

        queue.dequeue();
        queue.displayQueue();
        System.out.println("Size: "+queue.length()+"\n");

        System.out.println("enqueue Element : ");

        queue.enqueue(7);
        queue.displayQueue();
        System.out.println("Size: "+queue.length());
    }
}
