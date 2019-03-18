package string;

public class BinaryTree {

    public NodeTree init(){
        //NodeTree I = new NodeTree("I",null,null);
        //NodeTree H = new NodeTree("H",null,null);
        //NodeTree G = new NodeTree("G",null,null);
        NodeTree F = new NodeTree("F",null,null);
        NodeTree E = new NodeTree("E",null,null);
        NodeTree D = new NodeTree("D",null,null);
        NodeTree C = new NodeTree("C",F,null);
        NodeTree B = new NodeTree("B",D,E);
        NodeTree A = new NodeTree("A",B,C);
        return A;
    }

    public void preTraversal(NodeTree nodeTree) {
        //先序遍历是先找根节点，然后左节点，然后右节点
        System.out.print(nodeTree.getData() + " ");
        //nodeTree.getData();
        if (nodeTree.getLeftNodeTree() != null){
            preTraversal(nodeTree.getLeftNodeTree());
        }
        if (nodeTree.getRightNodeTree() != null){
            preTraversal(nodeTree.getRightNodeTree());
        }
    }

    public void inTraversal(NodeTree nodeTree){
        if (nodeTree.getLeftNodeTree() != null){
            inTraversal(nodeTree.getLeftNodeTree());
        }
        System.out.print(nodeTree.getData() + " ");
        if (nodeTree.getRightNodeTree() != null){
            inTraversal(nodeTree.getRightNodeTree());
        }
    }

    public void postTraversal(NodeTree nodeTree){
        if (nodeTree.getLeftNodeTree() != null){
            postTraversal(nodeTree.getLeftNodeTree());
        }
        if (nodeTree.getRightNodeTree() != null){
            postTraversal(nodeTree.getRightNodeTree());
        }
        System.out.print(nodeTree.getData() + " ");
    }

    public int getNodeTreeDepth(NodeTree nodeTree){
        if (nodeTree.getLeftNodeTree() == null && nodeTree.getRightNodeTree() == null){
            return 1;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        if (nodeTree.getLeftNodeTree() != null){
            leftDepth = getNodeTreeDepth(nodeTree.getLeftNodeTree());
        }
        if (nodeTree.getRightNodeTree() != null){
            rightDepth = getNodeTreeDepth(nodeTree.getRightNodeTree());
        }
        return leftDepth >= rightDepth ? leftDepth +1 : rightDepth + 1;
        //if (leftDepth >= rightDepth){
        //    System.out.println("树的深度为：" + leftDepth);
        //    return leftDepth + 1;
        //}else{
        //    System.out.println("树的深度为：" + rightDepth);
        //    return rightDepth + 1;
        //}
    }



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        NodeTree nodeTree = binaryTree.init();
        System.out.print("先序遍历：");
        binaryTree.preTraversal(nodeTree);
        System.out.println();
        System.out.print("中序遍历：");
        binaryTree.inTraversal(nodeTree);
        System.out.println();
        System.out.print("后序遍历：");
        binaryTree.postTraversal(nodeTree);
        System.out.println();
        System.out.println("树的高度为：" + binaryTree.getNodeTreeDepth(nodeTree));

    }
}
