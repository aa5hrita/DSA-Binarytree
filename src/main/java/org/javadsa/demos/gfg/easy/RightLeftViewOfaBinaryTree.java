package org.javadsa.demos.gfg.easy;

import org.javadsa.demos.util.Node;

import java.util.ArrayList;
import java.util.List;

public class RightLeftViewOfaBinaryTree {

    static void getRightLeftViewOfBinaryTree(Node root) {
        if (root == null) return;

        // List to store the result
        List<Integer> result = new ArrayList<>();

        leftView(root, 0, result);
        System.out.println("LEFT VIEW: " + result);
        result.clear();
        rightView(root, 0, result);
        System.out.println("RIGHT VIEW: " + result);
    }

    static void leftView(Node currNode, int level, List<Integer> resultList) {
        if (currNode == null) return;

        if (resultList.size() == level) resultList.add(currNode.data);

        leftView(currNode.left, level + 1, resultList);
        leftView(currNode.right, level + 1, resultList);

    }

    static void rightView(Node currNode, int level, List<Integer> resultList) {
        if (currNode == null) return;

        if (resultList.size() == level) resultList.add(currNode.data);

        rightView(currNode.right, level + 1, resultList);
        rightView(currNode.left, level + 1, resultList);

    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(24);
        root.right = new Node(27);
        root.left.left = new Node(31);
        root.left.right = new Node(42);
        root.right.left = new Node(40);
        root.right.right = new Node(36);

        getRightLeftViewOfBinaryTree(root);
    }
}
