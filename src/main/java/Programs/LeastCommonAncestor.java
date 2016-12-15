package Programs;

import BasicClasses.NodeTree;

/**
 * Created by divya on 6/6/16.
 */
public class LeastCommonAncestor {
    public NodeTree LeastCommonAncestor(NodeTree root, NodeTree a, NodeTree b){
        NodeTree left,right;
        if(root==null)
            return null;
        if((root==a)||(root==b))
            return root;
       left =  LeastCommonAncestor(root.getLeft(),a,b);
        right = LeastCommonAncestor(root.getRight(),a,b);
        if((left!=null)&&(right!=null))
            return root;
        else{
            if(left!=null)
                return left;
            else
                return right;
        }
    }
}
