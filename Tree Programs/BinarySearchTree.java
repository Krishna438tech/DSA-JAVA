public class BinarySearchTree {

    // Tree ke ek node ko represent karne wali class
    static class Node {
        // Node ke andar store hone wali value
        int data;
        // Left child ka reference
        Node left;
        // Right child ka reference
        Node right;
        // Constructor: naya node banate time value set karega
        Node(int data) {
            this.data = data;

            // Shuru mein left aur right child nahi hote
            this.left = null;
            this.right = null;
        }
    }
    // Tree ka starting node
    // Root ke through poore tree ko access karte hain
    Node root;
    public static void main(String[] args) {

        // BinarySearchTree class ka object banaya
        BinarySearchTree tree = new BinarySearchTree();

        // Tree mein values insert kar rahe hain
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");

        // Tree ko sorted order mein print karega
        tree.inorder(tree.root);

        System.out.println();

        // Search karne ke liye value
        int target = 60;

        // Search method true ya false return karega
        boolean found = tree.search(tree.root, target);

        if(found){
            System.out.println(target + " tree mein mil gaya.");
        } else{
            System.out.println(target + " tree mein nahi mila.");
        }
    }

    // Tree mein new value insert karne ka method
    Node insert(Node root, int value) {

        // Agar current position khaali hai
        // to yahan naya node bana denge
        if(root == null){
            return new Node(value);
        }

        // BST Rule:
        // Chhoti value left side jaati hai
        if(value < root.data){

            root.left = insert(root.left, value);
        }

        // Badi value right side jaati hai
        else if (value > root.data){
            root.right = insert(root.right, value);
        }

        // Agar same value dobara aaye
        // to is code mein insert nahi hogi

        // Updated root return kar rahe hain
        return root;
    }


    // Inorder Traversal:
    // Left -> Root -> Right
    void inorder(Node root){

        // Jab tak node null nahi hai
        if(root != null) {

            // Pehle left subtree
            inorder(root.left);

            // Phir current node
            System.out.print(root.data + " ");

            // Phir right subtree
            inorder(root.right);
        }
    }


    // Tree mein value search karne ka method
    boolean search(Node root, int target) {

        // Agar node null ho gaya
        // matlab value tree mein nahi mili
        if(root == null){
            return false;
        }

        // Agar current node par target mil gaya
        if(root.data == target) {
            return true;
        }

        // Target current value se chhota hai
        // to left side search karenge
        if(target < root.data) {
            return search(root.left, target);
        }

        // Target current value se bada hai
        // to right side search karenge
        return search(root.right, target);
    }
}
