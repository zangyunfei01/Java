package string;

import java.util.function.BinaryOperator;

public class BinaryTreeTest {
    public NodeTreeTest init() {
        NodeTreeTest F = new NodeTreeTest("F", null, null);
        NodeTreeTest D = new NodeTreeTest("D", null, null);
        NodeTreeTest E = new NodeTreeTest("E", null, null);
        NodeTreeTest B = new NodeTreeTest("B", D, E);
        NodeTreeTest C = new NodeTreeTest("C", F, null);
        NodeTreeTest A = new NodeTreeTest("A", B, C);
        return A;
    }

    public void preTest(NodeTreeTest nodeTreeTest) {
        System.out.println(nodeTreeTest.data + " ");
        if (nodeTreeTest.getLeftNodeTree() != null) {
            preTest(nodeTreeTest.getLeftNodeTree());
        }
        if (nodeTreeTest.getRightNodeTree() != null) {
            preTest(nodeTreeTest.getRightNodeTree());
        }
    }

    public void midTest(NodeTreeTest nodeTreeTest) {
        if (nodeTreeTest.getLeftNodeTree() != null) {
            preTest(nodeTreeTest.getLeftNodeTree());
        }
        System.out.println(nodeTreeTest.data + " ");
        if (nodeTreeTest.getRightNodeTree() != null) {
            preTest(nodeTreeTest.getRightNodeTree());
        }
    }

    public void behindTest(NodeTreeTest nodeTreeTest) {
        if (nodeTreeTest.getLeftNodeTree() != null) {
            preTest(nodeTreeTest.getLeftNodeTree());
        }
        if (nodeTreeTest.getRightNodeTree() != null) {
            preTest(nodeTreeTest.getRightNodeTree());
        }
        System.out.println(nodeTreeTest.data + " ");
    }

    public int getNodeTreeTestDepth(NodeTreeTest nodeTreeTest) {
        if (nodeTreeTest.getLeftNodeTree() == null && nodeTreeTest.getRightNodeTree() == null) {
            return 1;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        if (nodeTreeTest.getLeftNodeTree() != null){
            leftDepth = getNodeTreeTestDepth(nodeTreeTest.getLeftNodeTree());
        }
        if (nodeTreeTest.getRightNodeTree() != null) {
            rightDepth = getNodeTreeTestDepth(nodeTreeTest.getRightNodeTree());
        }
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

    public static void main(String[] args) {
        BinaryTreeTest binaryTreeTest = new BinaryTreeTest();
        NodeTreeTest nodeTreeTest = binaryTreeTest.init();
        binaryTreeTest.preTest(nodeTreeTest);
        binaryTreeTest.midTest(nodeTreeTest);
        binaryTreeTest.behindTest(nodeTreeTest);
        System.out.println("depth" + binaryTreeTest.getNodeTreeTestDepth(nodeTreeTest));
    }
}
