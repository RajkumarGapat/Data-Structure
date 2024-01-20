package ADS_24_May_2023;

//Single Linked List implement into stack

class Link {
 int element;
 Node next;

 public Link(int element) {
     this.element = element;
     this.next = null;
 }
}

class  List {
 
 private Node top;
 private int size;

 public List() {
     
     this.top = null;
     this.size = 0;
 }

 public int length() {

     return size;
 }

 public boolean isEmpty() {
     return top == null;
 }

 public void push(int element) {
     Node newest = new Node(element);

     if (isEmpty()) {
         
         top = newest;
         
     } else {
         newest.next = top;
         top = newest;
           
     }
     size = size + 1; 
 }

 public int pop() {
     if (isEmpty()) {
         System.out.println("Stack is empty.");
         return -1;
     } else {
         int element = top.element;
         top = top.next;
         size = size - 1;
         return element;
     }
 }

 public int peek() {
     if (isEmpty()) {
         System.out.println("Stack is empty.");
         return -1;
     } else {
         return top.element;
     }
 }

 public void display() {
     if (isEmpty()) {
         System.out.println("Stack is empty.");
     } else {
         Node current = top;
         while (current != null) {
             System.out.print(current.element + " -> ");
             current = current.next;
         }
         System.out.println();
     }
 }
}

public class SLLStack {
 public static void main(String[] args) {
     List s = new List();

     System.out.println("Adding the element at Top");

     s.push(100);
     s.push(90);
     s.push(80);
     s.push(70);

     s.display();
     System.out.println("Size: "+s.length());


     System.out.println("Pop: " + s.pop());
     System.out.println("Peek: " + s.peek());

     s.display();
     System.out.println("Size: "+s.length());        
 }
}