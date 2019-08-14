package binarytree;

/**
 *  二叉树
 */
public class BinaryTreeNode {

    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    int data;

    BinaryTreeNode() {

    }

    BinaryTreeNode(int newData) {
        leftChild = null;
        rightChild = null;
        data = newData;
    }
}
