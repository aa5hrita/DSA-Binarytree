package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

import java.util.LinkedList;
import java.util.Queue;

//The height of the tree is the number of vertices in the tree from the root to the deepest node.
public class HeightOfBinaryTree {

    //Approach 1: Recursion
    static int maxDepth(Node root) {
        if (root == null) return 0; //empty binary tree

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    //Approach 2: Level Order Traversal
    static int height(Node root) {
        if (root == null) return 0;

        // Initializing a queue to traverse the tree level by level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            int size = q.size();

            // Traverse all nodes at the current level
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            height++;  // Increment height after traversing each level
        }
        return height;
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(31);
        root.right = new Node(14);
        root.left.left = new Node(52);

        System.out.println("APR 1: Recursion: Height/Max Depth of the Tree is: " + maxDepth(root));
        System.out.println("APR 2: LOT: Height/Max Depth of the Tree is: " + height(root));
    }
}
