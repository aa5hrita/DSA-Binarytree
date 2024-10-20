package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion_Queue {
    // Function to insert a new node in the binary tree
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key); //empty tree - create root and return
        // Create a queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root); //FIFO

        while (!q.isEmpty()) {
            Node temp = q.poll(); //remove the front element

            // If left child is empty, insert the new node here
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left); //for further traversal
            }
            // If right child is empty, insert the new node here
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);//for further traversal
            }
        }
        return root;
    }

    // In-order traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("Inorder traversal before insertion: ");
        inorder(root);
        System.out.println();

        int key = 6;
        root = insert(root, key);

        System.out.print("Inorder traversal after insertion: ");
        inorder(root);
        System.out.println();
    }
}
