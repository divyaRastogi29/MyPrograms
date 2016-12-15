package BasicClasses;

/**
 * Created by divya on 6/6/16.
 */
public class NodeTree {
    private int data;
    private NodeTree left;
    private NodeTree right;
    private int hd;

    public NodeTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public NodeTree formBinaryTree(){
        //NodeTree node = new NodeTree(1);
        NodeTree node1 = new NodeTree(2);
        NodeTree node2 = new NodeTree(3);
        this.setLeft(node1);
        this.setRight(node2);
        NodeTree node3 = new NodeTree(4);
        NodeTree node4 = new NodeTree(5);
        node1.setLeft(node3);
        node1.setRight(node4);
        NodeTree node5 = new NodeTree(6);
        NodeTree node6 = new NodeTree(7);
        node2.setLeft(node5);
        node2.setRight(node6);
       /* NodeTree node7 = new NodeTree(25);
        node2.setRight(node7);*/
        return this;
    }
}
