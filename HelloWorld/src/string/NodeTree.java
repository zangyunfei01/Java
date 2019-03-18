package string;

public class NodeTree {
    private String data;
    private NodeTree leftNodeTree;
    private NodeTree rightNodeTree;

    public NodeTree(String data, NodeTree leftNodeTree, NodeTree rightNodeTree) {
        this.data = data;
        this.leftNodeTree = leftNodeTree;
        this.rightNodeTree = rightNodeTree;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setLeftNodeTree(NodeTree leftNodeTree) {
        this.leftNodeTree = leftNodeTree;
    }

    public NodeTree getLeftNodeTree() {
        return leftNodeTree;
    }

    public void setRightNodeTree(NodeTree rightNodeTree) {
        this.rightNodeTree = rightNodeTree;
    }

    public NodeTree getRightNodeTree() {
        return rightNodeTree;
    }
}