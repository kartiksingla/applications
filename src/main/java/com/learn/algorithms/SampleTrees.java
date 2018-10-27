package com.learn.algorithms;

public class SampleTrees {

    /**
     *                    1
     *                 /    \ 
     *                2      3
     *               /\     / \
     *              4  5   6   7
     *                / \      /
     *               8  9     10
     *               \         \
     *               11        12
     *              / \        /
     *             13 14      15
     *                         \
     *                         16
     *              
     * @return
     */
    public static Node getComplexUnEvenLengthTree() {
        Node node = new Node(1);
        node.left = new Node(2);

        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.right.left = new Node(8);
        node.left.right.right = new Node(9);
        node.left.right.left.right = new Node(11);
        node.left.right.left.right.left = new Node(13);
        node.left.right.left.right.right = new Node(14);

        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.right.right.left = new Node(10);
        node.right.right.left.right = new Node(12);
        node.right.right.left.right.left = new Node(15);
        node.right.right.left.right.left.right = new Node(16);
        return node;
    }
}
