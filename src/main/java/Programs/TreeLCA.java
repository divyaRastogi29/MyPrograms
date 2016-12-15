package Programs;

import BasicClasses.NodeTree;

/**
 * Created by divya on 19/5/16.
 */
public class TreeLCA {
   public static void main(String[] args){
       BinaryTree tree = new BinaryTree();
       tree.root = new NodeTree(1);
       tree.root.setLeft(new NodeTree(2));
       tree.root.setRight(new NodeTree(3));
       tree.root.getLeft().setLeft(new NodeTree(4));
       tree.root.getLeft().setRight(new NodeTree(5));
       tree.root.getRight().setLeft(new NodeTree(6));
       tree.root.getRight().setRight(new NodeTree(7));
       tree.root.getLeft().getRight().setLeft(new NodeTree(8));
       tree.root.getLeft().getRight().setRight(new NodeTree(9));
       tree.findLCA(tree.root,4,9);
   }
}



