package string;

public class NodeTreeTest {
    public String data;
    public NodeTreeTest leftNodeTree;
    public NodeTreeTest rightNodeTree;

    public NodeTreeTest(String data,NodeTreeTest leftNodeTree,NodeTreeTest rightNodeTree){
        this.data = data;
        this.leftNodeTree = leftNodeTree;
        this.rightNodeTree = rightNodeTree;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setLeftNodeTree(NodeTreeTest leftNodeTree){
        this.leftNodeTree = leftNodeTree;
    }

    public NodeTreeTest getLeftNodeTree(){
        return leftNodeTree;
    }

    public NodeTreeTest getRightNodeTree(){
        return rightNodeTree;
    }
}
