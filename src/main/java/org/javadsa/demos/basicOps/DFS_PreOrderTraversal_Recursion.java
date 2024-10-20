package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

public class DFS_PreOrderTraversal_Recursion {
    // Pre-order DFS: Root, Left, Right
    static void preOrderDFS(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    public static void main(String[] args) {
        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("\nPre-order DFS: ");
        preOrderDFS(root);
    }
}
