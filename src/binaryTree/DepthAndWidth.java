package binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 */
public class DepthAndWidth {

    public static int treeDepth(BinaryTreeNode root) {
        return 0;
    }

    public static int treeWidth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 1;
        Queue<BinaryTreeNode> tempQueue = new ArrayDeque<>();

        tempQueue.add(root);
        int len = 1;

        while (true) {
            len = tempQueue.size();
            if (len == 0) {
                break;
            }

            while (len > 0) {
                BinaryTreeNode tempNode = tempQueue.poll();
                len--;

                if (tempNode.leftChild != null) {
                    tempQueue.add(tempNode.leftChild);
                }

                if (tempNode.rightChild != null) {
                    tempQueue.add(tempNode.rightChild);
                }
            }

            if (tempQueue.size() > maxWidth) {
                maxWidth = tempQueue.size();
            }
        }



        return maxWidth;
    }
}
