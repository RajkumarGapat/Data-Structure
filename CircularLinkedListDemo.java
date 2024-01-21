package ADS_24_May_2023;

class Node {
    int element;
    Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int element) {
        Node newest = new Node(element);

        if (head == null) {
            head = newest;
            tail = newest;
            newest.next = head;
        } else {
            newest.next = head;
            head = newest;
            tail.next = head;
        }
    }

    public void addLast(int element) {
        Node newest = new Node(element);

        if (tail == null) {
            head = newest;
            tail = newest;
            newest.next = head;
        } else {
            tail.next = newest;
            tail = newest;
            tail.next = head;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        }
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("Circular linked list is empty.");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = head;
                tail = temp;
            }
        }
    }

    public void addElement(int element, int position) {
        Node newest = new Node(element);

        if (head == null) {
            if (position != 0) {
                System.out.println("Invalid position.");
                return;
            }
            head = newest;
            tail = newest;
            newest.next = head;
        } else {
            if (position == 0) {
                newest.next = head;
                head = newest;
                tail.next = head;
            } else { Node temp = head;
                int currentPosition = 0;

                while (temp != tail && currentPosition < position - 1) {
                    temp = temp.next;
                    currentPosition++;
                }

                if (temp == tail && currentPosition < position - 1) {
                    System.out.println("Invalid position.");
                    return;
                }

                newest.next = temp.next;
                temp.next = newest;
                if (temp == tail) {
                    tail = newest;
                    tail.next = head;
                }
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.element + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();

        System.out.println("Element Add First");

        l.addFirst(100);
        l.addFirst(90);
        l.addFirst(80);
        l.addFirst(70);

        l.display();

        System.out.println("Element Add Last");

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);

        l.display();

        System.out.println("Deleting the First element");
        l.deleteFirst();
        l.display();

        System.out.println("Deleting the Last element");
        l.deleteLast();
        l.display();

        System.out.println("After adding element at desired position");

        l.addElement(50, 0); 
        l.addElement(60, 1); 
        l.addElement(55, 2); 
        l.addElement(45, 3); 

        l.display();
    }
}