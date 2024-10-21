package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

// Total number of leaves in teh binary tree
public class SizeOfBinaryTree {

    static int size(Node root) {

        if (root == null) return 0;

        return size(root.left) + size(root.right) + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Recursion: Size of the BT: " + size(root));

    }
}
