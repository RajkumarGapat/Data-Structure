package ADS_24_May_2023;

public class QueueArrayDemo {
    private final int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueArrayDemo(int n) {                                         //Constructor
        data = new int[n];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int length() {


        return size;
    }

    public boolean isEmpty() {


        return size == 0;
    }

    public boolean isFull() {

        return size == data.length;
    }

    public void enqueue(int e) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            data[rear] = e;
            rear = rear + 1;
            size = size + 1;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            int e = data[front];
            front = front + 1;
            size = size - 1;
            return e;
        }
    }

    public void display() {
        for(int i=front;i<rear;i++)
            System.out.print(data[i] + "--");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArrayDemo q = new QueueArrayDemo(10);
        q.enqueue(100);
        q.enqueue(200);
        q.display();
        System.out.println("Size: " + q.length());
        System.out.println("Element Removed: " + q.dequeue());
        System.out.println("IsEmpty: "+q.isEmpty());
        System.out.println("Element Removed: " + q.dequeue());
        System.out.println("IsEmpty: "+q.isEmpty());
        q.enqueue(300);
        q.enqueue(400);
        q.enqueue(500);
        q.display();
        System.out.println("Size: " + q.length());
    }
}
