package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 14/12/16.
 */
public class DiameterOfBinaryTree {

    public static int diameter(NodeTree root){
        if(root==null)
            return 0;
        int lHeight = height(root.getLeft());
        int rHeight = height(root.getRight());
        int ldiameter = diameter(root.getLeft());
        int rdiameter = diameter(root.getRight());

        return Math.max(1+lHeight+rHeight,Math.max(ldiameter,rdiameter));

    }

    public static int height(NodeTree root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.getLeft()),height(root.getRight()));
    }
}
