//package Tree Programs;

public class tree_basic {

    // Node class tree ke ek single node ko represent karti hai
    static class Node {

        // Node ke andar store hone wali value
        int data;

        // Left child ka reference
        Node left;

        // Right child ka reference
        Node right;

        // Constructor
        // Jab naya Node banega, tab data ki value set hogi
        Node(int data) {

            this.data = data;

            // Starting mein node ke left aur right child nahi hain
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        // Tree ka root node bana rahe hain
        Node root = new Node(10);

        // Root ke left aur right child bana rahe hain
        root.left = new Node(20);
        root.right = new Node(30);

        // Node 20 ke children bana rahe hain
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Node 30 ke children bana rahe hain
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Tree ki values manually print kar rahe hain
        System.out.println("Root Node: " + root.data);

        System.out.println("Root ka Left Child: " + root.left.data);

        System.out.println("Root ka Right Child: " + root.right.data);

        System.out.println("20 ka Left Child: " + root.left.left.data);

        System.out.println("20 ka Right Child: " + root.left.right.data);

        System.out.println("30 ka Left Child: " + root.right.left.data);

        System.out.println("30 ka Right Child: " + root.right.right.data);
    }
}