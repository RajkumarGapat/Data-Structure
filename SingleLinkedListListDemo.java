package ADS_24_May_2023;

public class SingleLinkedListListDemo {
    private class Node {
        int data;
        Node next;
        int Size;

        Node(int item) {                                             // Constructor of Node 
            data = item;
            next = null;
            Size = 0;
        }
    }
    private Node head;
    private Node tail;
    private int Size;
    public int length() {
    	return Size;
    }
    public void addFirst(int item) {    	
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        Size = Size + 1;
    }

    public void addLast(int item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        Size = Size + 1;
    }

    public void addAtPosition(int item, int position) {
        if (position <= 0) {
            addFirst(item);
        } else if (position >= getSize()) {
            addLast(item);
        } else {
            Node newNode = new Node(item);
            Node temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        Size = Size + 1;
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

        temp.next = temp.next.next;
    }

    public void deleteFirst() {
        if (head == null) {
            return; 
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        Size = Size - 1;
    }

    public void deleteLast() {
        if (head == null) {
            return; 
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        Size = Size - 1;
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public int search(int key) { 
    	 Node temp = head; 
    	 int index = 1; 
    	 while(temp!=null) { 
    	 if(temp.data==key) 
    	 return index; 
    	 temp = temp.next; 
    	 index = index + 1; 
    	 } 
    	 return -1; 
    	 }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedListListDemo list = new SingleLinkedListListDemo();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
       
        list.display();
        System.out.println(" After adding Last Element Size = " + list.length());
        
       list.addFirst(15);
        list.addFirst(14);
        System.out.println("Size = " + list.length());
        
        list.addAtPosition(25, 3);
        System.out.println("Size = " + list.length());
       
        list.display(); 
        
        list.deleteElement(2);
        list.display();
        
        list.deleteFirst();
        System.out.println("Size = " + list.length());
        list.deleteLast();
        System.out.println("Size = " + list.length());
        list.display();
        
        int position = list.search(30); 
        System.out.println("Element Position: " + position);
        
        list.display(); 
    }
}
