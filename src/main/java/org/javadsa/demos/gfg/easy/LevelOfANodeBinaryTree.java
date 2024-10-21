package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

public class LevelOfANodeBinaryTree {

    static int getLevelOfANode(Node root, int target, int level) {
        if (root == null) return -1;

        if (root.data == target) return level;

        int leftLevel = getLevelOfANode(root.left, target, level + 1);
        int rightLevel = getLevelOfANode(root.right, target, level + 1);

        return Math.max(leftLevel, rightLevel);
    }

    public static void main(String[] args) {

        // Creating a sample binary tree:
        //       1               level 1
        //      / \
        //     2   3             level 2
        //    / \ / \
        //   4  5 6  7           level 3


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 10;

        System.out.println("Level of Target Node is: " + getLevelOfANode(root, target, 1));
    }

}
