package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeaves {

    // Recursive function to count the leaf nodes in a binary tree
    static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }

        // If the node has no left or right child, it is a leaf
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Recursively count the leaves in the left and right subtrees
        return countLeaves(root.left) + countLeaves(root.right);
    }

    //Iterative Function to count BT leaves
    static int countLeaves2(Node root) {
        if (root == null) {
            return 0;
        }
        // Initialize a queue for level order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;

        // Traverse the tree using level order traversal
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr.left == null && curr.right == null) {
                count++; // Increment if the current node is a leaf node
            }

            // Enqueue left and right children if they exist
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(" Recursion: Number of leaves in the BT: " + countLeaves(root));

        System.out.println(" Iteration/LOT: Number of leaves in the BT: " + countLeaves2(root));
    }
}
