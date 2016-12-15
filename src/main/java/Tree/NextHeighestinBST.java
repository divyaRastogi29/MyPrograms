package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 15/12/16.
 */
public class NextHeighestinBST {

    public static int nextHeighestNode(NodeTree root){
        if(root.getRight()==null)
            return -1;
        else{
            root = root.getRight();
            while(root.getLeft()!=null)
                root = root.getLeft();
            return root.getData();
        }
    }
}
