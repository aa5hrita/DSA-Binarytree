package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

public class DFS_InorderTraversal_Recursion {
    // In-order DFS: Left, Root, Right
    static void inOrderDFS(Node node) {
        if (node == null) return;
        inOrderDFS(node.left);
        System.out.print(node.data + " ");
        inOrderDFS(node.right);
    }

    public static void main(String[] args) {
        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("In-order DFS: ");
        inOrderDFS(root);
    }
}
