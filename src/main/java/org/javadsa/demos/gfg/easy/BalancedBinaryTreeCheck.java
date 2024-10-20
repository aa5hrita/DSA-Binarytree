package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

// A height balanced binary tree is a binary tree in which the height of the left subtree and right subtree
// of any node does not differ by more than 1 and both the left and right subtree are also height balanced.
public class BalancedBinaryTreeCheck {

    static boolean isBalanced(Node node) {
        int leftTreeHeight, rightTreeHeight;
        if (node == null) return true;

        /* Get the height of left and right subtrees */
        leftTreeHeight = height(node.left);
        rightTreeHeight = height(node.right);

        if (Math.abs(leftTreeHeight - rightTreeHeight) <= 1 && isBalanced(node.left)
                && isBalanced(node.right)) {
            return true;
        }

        //If we reach here then tree is not height-balanced
        return false;
    }

    static int height(Node node) {
        if (node == null) return 0;

        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Function to check if tree is height balanced in the same recursion
    static int isBalanced2(Node root) {
        if (root == null)
            return 0;

        int leftHeight = isBalanced2(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = isBalanced2(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        else
            return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        if (isBalanced(root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");

        if (isBalanced2(root) > 0)
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
