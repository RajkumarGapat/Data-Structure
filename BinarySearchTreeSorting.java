package ADS_24_May_2023;

class BinarySearchTreeSorting {
class Node {
    int element;
    Node left;
    Node right;

    public Node(int e) {
        element = e;
        left = null;
        right = null;
    }
}

    Node root;

    BinarySearchTreeSorting() { 
        root = null;
    }

    void insert(int element) {
        root = insertRecord(root, element);
    }

    Node insertRecord(Node root, int element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }

        if (element < root.element)
            root.left = insertRecord(root.left, element);
        else if (element > root.element)
            root.right = insertRecord(root.right, element);

        return root;
    }

    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.element + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeSorting Sortbst = new BinarySearchTreeSorting();

        Sortbst.insert(50);
        Sortbst.insert(30);
        Sortbst.insert(80);
        Sortbst.insert(10);
        Sortbst.insert(40);
        Sortbst.insert(60);
        Sortbst.insert(90);

        System.out.println("Elements in sorted order:");
        Sortbst.inorderTraversal(Sortbst.root);
    }
}