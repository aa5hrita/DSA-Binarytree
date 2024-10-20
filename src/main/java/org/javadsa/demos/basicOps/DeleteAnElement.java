package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteAnElement {
    // Function to delete a node from the binary tree
    static Node deleteNode(Node root, int val) {
        if (root == null) return null;

        // Use a queue to perform BFS to find the target
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node target = null;

        // Find the target node
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.data == val) {
                target = curr;
                break;
            }
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        if (target == null) return root;

        // Find the deepest rightmost node and its parent
        Node lastNode = null;
        Node lastParent = null;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> parentQueue = new LinkedList<>();
        q1.add(root);
        parentQueue.add(null);

        while (!q1.isEmpty()) {
            Node curr = q1.poll();
            Node parent = parentQueue.poll();

            lastNode = curr;
            lastParent = parent;

            if (curr.left != null) {
                q1.add(curr.left);
                parentQueue.add(curr);
            }
            if (curr.right != null) {
                q1.add(curr.right);
                parentQueue.add(curr);
            }
        }

        // Replace target's value with the last node's value
        target.data = lastNode.data;

        // Remove the last node
        if (lastParent != null) {
            if (lastParent.left == lastNode) lastParent.left = null;
            else lastParent.right = null;
        } else {
            return null;
        }
        return root;
    }

    // In-order traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);

        System.out.print("Original tree (in-order): ");
        inorder(root);
        System.out.println();

        int valToDel = 3;
        root = deleteNode(root, valToDel);

        System.out.print("Tree after deleting " + valToDel + " (in-order): ");
        inorder(root);
        System.out.println();
    }
}
