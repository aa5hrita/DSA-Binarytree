package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

// A binary tree where left subtree is mirror image of right subtree
public class SymmetricBinaryTree {

    static boolean checkForSymmetry(Node root) {
        if (root == null) return true; // If tree is empty, it's symmetric

        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    static boolean isMirror(Node leftSubTree, Node rightSubTree) {

        if (leftSubTree == null && rightSubTree == null) return true;

        if (leftSubTree == null || rightSubTree == null) return false;

        return (leftSubTree.data == rightSubTree.data) &&
                isMirror(leftSubTree.left, rightSubTree.right) &&
                isMirror(leftSubTree.right, rightSubTree.left);
    }

    public static void main(String[] args) {

        // Creating a sample symmetric binary tree
        //        1
        //       / \
        //      2   2
        //     / \ / \
        //    3  4 4  3
        Node root = new Node(12);
        root.left = new Node(24);
        root.right = new Node(27);
        root.left.left = new Node(31);
        root.left.right = new Node(42);
        root.right.left = new Node(40);
        root.right.right = new Node(36);

        System.out.println(checkForSymmetry(root));
    }
}
