package org.javadsa.demos.basicOps;

import org.javadsa.demos.util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_LevelOrderTraversal_Queue {

    // BFS: Level order traversal
    static void BFSLevelOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("\nLevel order: ");
        BFSLevelOrderTraversal(root);
    }
}
