package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

public class SearchAnElement {
    // Function to search for a value in the binary tree using InOrder DFS
    // (InOrder DFS Algorithm) Current Node, Left Subtree, Right Subtree
    static boolean searchDFS(Node root, int value) {
        // Base case: If the tree is empty, or we've reached a leaf node
        if (root == null) return false;

        // If the node's data is equal to the value we are searching for
        if (root.data == value) return true;

        // Recursively search in the left and right subtrees
        boolean left_result = searchDFS(root.left, value);
        boolean right_result = searchDFS(root.right, value);

        return left_result || right_result;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);

        int value = 6;
        if (searchDFS(root, value))
            System.out.println(value + " is found in the binary tree");
        else
            System.out.println(value + " is not found in the binary tree");
    }

}
