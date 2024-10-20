package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

public class DFS_PostOrderTraversal_Recursion {
    // Post-order DFS: Left, Right, Root
    static void postOrderDFS(Node node) {
        if (node == null) return;
        postOrderDFS(node.left);
        postOrderDFS(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("\nPost-order DFS: ");
        postOrderDFS(root);
    }

}
