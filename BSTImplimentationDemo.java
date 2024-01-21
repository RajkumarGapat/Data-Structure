package ADS_24_May_2023;

public class BSTImplimentationDemo {
class Node {
    int element;
    Node left;
    Node right;

    public Node(int e) {
        element = e;
        left =  null;
        right = null;
    }
}

    Node root;

    BSTImplimentationDemo() {
        root = null;
    }

    void insert(int element) {
        root = insertRec(root, element);
    }

    Node insertRec(Node root, int element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }

        if (element < root.element)
            root.left = insertRec(root.left, element);
        else if (element > root.element)
            root.right = insertRec(root.right, element);

        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println("\n");
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.element + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
        System.out.println("\n");
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.element + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
        System.out.println("\n");
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.element + " ");
        }
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.element == key)
            return true;

        if (key < root.element)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    int count() {
        return countRec(root);
    }

    int countRec(Node root) {
        if (root == null)
            return 0;

        int count = 1;
        count += countRec(root.left);
        count += countRec(root.right);
        return count;
    }

    int height() {
        return heightRec(root);
    }

    int heightRec(Node root) {
        if (root == null)
            return 0;

        int leftHeight = heightRec(root.left);
        int rightHeight = heightRec(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.element)
            root.left = deleteRec(root.left, key);
        else if (key > root.element)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.element = minValue(root.right);

            root.right = deleteRec(root.right, root.element);
        }
        return root;
    }

    int minValue(Node root) {
        int minVal = root.element;
        while (root.left != null) {
            minVal = root.left.element;
            root = root.left;
        }
        return minVal;
    }

    public static void main(String[] args) {
        BSTImplimentationDemo tree = new BSTImplimentationDemo();

        tree.insert(10);
        tree.insert(8);
        tree.insert(15);
        tree.insert(9);
        tree.insert(12);
        tree.insert(20);

        System.out.println("Preorder traversal of the BST:");
        tree.preorder();

        System.out.println("Inorder traversal of the BST:");
        tree.inorder();

        System.out.println("Postorder traversal of the BST:");
        tree.postorder();

        int searchKey = 9;
        System.out.println("Search for element " + searchKey + ": " +     tree.search(searchKey)+"\n"); 

        System.out.println("Number of nodes in BST: " + tree.count()+"\n");

        System.out.println("Height of BST: " + tree.height()+"\n");

        int deleteKey = 15;
        System.out.println("Deleting node with value " + deleteKey);
        tree.delete(deleteKey);

        

        System.out.println("Preorder traversal of the BST after Delete Element:");
        tree.preorder();

        System.out.println("Inorder traversal of the BST after Delete Element:");
        tree.inorder();

        System.out.println("Postorder traversal of the BST after Delete Element:");
        tree.postorder();

    }
}

