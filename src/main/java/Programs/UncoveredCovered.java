/*
import BasicClasses.NodeTree;

*/
/**
 * Created by divya on 6/6/16.
 *//*

public class UncoveredCovered {
    public static void main(String[] args){
        NodeTree root = new NodeTree(1);
        root = root.formBinaryTree();
        int leftsum = findUncoveredLeft(root);
        int rightSum = findUncoveredRight(root);
        int uncoveredSum = root.getData()+leftsum+rightSum;
    }

    public static int findUncoveredLeft(NodeTree root){
        int sum = 0;
      while (root.getLeft()!=null) {
          sum = sum + root.getLeft().getData();
          root = root.getLeft();
      }
        if(root.getRight()!=null)
            sum = sum + root.getRight().getData();
    }

    public static int findUncoveredRight(NodeTree root){
        int sum = 0;
        while (root.getRight()!=null) {
            sum = sum + root.getRight().getData();
            root = root.getLeft();
        }
        if(root.getLeft()!=null)
            sum = sum + root.getLeft().getData();
    }
}
*/
