package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

//Find the node that has the MAX/MIN data value.
public class MAXMINOfBinaryTree {

    static int maximum(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    static int minimum(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Recursion: MAX data element of the BT: " + maximum(root));

        System.out.println("Recursion: MIN data element of the BT: " + minimum(root));

    }

}
