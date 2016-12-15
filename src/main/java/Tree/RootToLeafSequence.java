package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 6/12/16.
 */

// Find if path from root to leaf is having given sequence
public class RootToLeafSequence {

    boolean existPath(NodeTree root, int[] arr, int i){
        if((root==null)&&(i==arr.length))
            return true ;
        if((root==null)&&(i<arr.length))
            return false ;
        if(root.getData()==arr[i]){
            return existPath(root.getLeft(),arr,i+1)||(existPath(root.getRight(),arr,i+1));
        }
        return false;
    }

}
