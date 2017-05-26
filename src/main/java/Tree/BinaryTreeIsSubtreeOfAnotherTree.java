package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 3/4/17.
 */
public class BinaryTreeIsSubtreeOfAnotherTree {

    public boolean isIdentical(NodeTree subRoot, NodeTree root){
        if((subRoot==null)&&(root==null))
            return true;
        if((subRoot!=null&&root==null)||(root!=null&&subRoot==null))
            return false ;

        if(subRoot.getData()==root.getData())
            return  isIdentical(subRoot.getLeft(), root.getLeft())&&isIdentical(subRoot.getRight(),root.getRight()) ;
        else
            return false;
    }

    public boolean isSubtree(NodeTree subRoot, NodeTree root){
       if(subRoot==null)
           return true;
       if(root==null)
           return false;
       if(isIdentical(subRoot, root))
           return true;
       else
           return isSubtree(subRoot, root.getLeft())||isSubtree(subRoot, root.getRight());
    }
}
