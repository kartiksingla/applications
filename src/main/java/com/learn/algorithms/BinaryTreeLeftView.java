package com.learn.algorithms;

import com.learn.algorithms.helper.SampleTrees;
import com.learn.algorithms.model.Node;

/**
 * Using recursive call 
 * Time Complexity : O(n)
 * @author kartik
 *
 */
public class BinaryTreeLeftView {

    Node rootNode;

    int maxHeight = 0;

    public BinaryTreeLeftView() {
        rootNode = SampleTrees.getComplexUnEvenLengthTree();
    }

    public static void main(String[] args) {
        BinaryTreeLeftView tree = new BinaryTreeLeftView();
        tree.printLeftView(tree.rootNode, 1);
    }

    private void printLeftView(Node node, int rowIndex) {
        if (node == null)
            return;
        if (maxHeight < rowIndex) {
            System.out.print(node.value + " ");
            maxHeight = rowIndex;
        }

        printLeftView(node.left, rowIndex + 1);
        printLeftView(node.right, rowIndex + 1);
    }
}
