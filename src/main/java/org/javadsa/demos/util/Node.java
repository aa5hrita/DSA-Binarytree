package org.javadsa.demos.util;

public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}