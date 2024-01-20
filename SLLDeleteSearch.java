package ADS_24_May_2023;

class Node {
    int element;
    Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int length() {

        return size;
    }

    public boolean isEmpty()

    {
        return size == 0;
    }

    public void addElement(int element, int position) {
        Node newest = new Node(element);

        if (position == 0) {
            newest.next = head;
            head = newest;
        } else {
            Node temp = head;
            int currentPosition = 0;

            while (temp != null && currentPosition < position - 1) {
                temp = temp.next;
                currentPosition++;
            }

            if (temp == null) {
                System.out.println("Invalid position.");
                return;
            }

            newest.next = temp.next;
            temp.next = newest;
        }
        size = size + 1;
    }

    public void deleteElement(int position) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        int currentPosition = 0;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }

        {temp.next = temp.next.next;}
        size = size - 1;
    }

    public int search(int key) {
        Node temp = head;
        int index = 1;
        while(temp!=null) {
            if(temp.element==key)
                return index;
                temp = temp.next;
            index = index + 1;
        }
        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.element + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

public class SLLDeleteSearch {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        System.out.println("After adding element at desired position");

        l.addElement(110, 0); 
        l.addElement(120, 1); 
        l.addElement(130, 2); 
        l.addElement(140, 3); 

        l.display();
        System.out.println("size: " + l.length()+"\n");

       
        System.out.println("After Deleting element at desired position");

        l.deleteElement(1);
        l.display();
        System.out.println("size: " + l.length() + "\n");

        int position = l.search(130);
        System.out.println("Element Position: " + position);      
    }
}
