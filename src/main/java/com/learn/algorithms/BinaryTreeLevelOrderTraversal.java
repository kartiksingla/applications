package com.learn.algorithms;

import java.util.LinkedList;
import java.util.Queue;

import com.learn.algorithms.helper.SampleTrees;
import com.learn.algorithms.model.Node;

/**
 * Using Queue
 * Time Complexity : O(n)
 * @author kartik
 *
 */
public class BinaryTreeLevelOrderTraversal {

    Node rootNode;

    public BinaryTreeLevelOrderTraversal() {
        rootNode = SampleTrees.getComplexUnEvenLengthTree();
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal bTree = new BinaryTreeLevelOrderTraversal();
        bTree.executeLevelOrderTraversal();
    }

    private void executeLevelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            System.out.print(currNode.value + " ");
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }
}
