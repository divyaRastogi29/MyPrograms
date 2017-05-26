package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 3/4/17.
 */
public class MaximumPathSum {

    int max_path_sum = Integer.MIN_VALUE ;

    public int maxPathSum(NodeTree root){

        if(root == null)
            return 0;
        int leftSum = maxPathSum(root.getLeft());
        int rightSum = maxPathSum(root.getRight());

       int first =  Math.max(root.getData(),Math.max(leftSum, rightSum)+root.getData());
       int second = Math.max(first, leftSum+rightSum+root.getData());
       if(max_path_sum<second)
           max_path_sum = second;
       return second;
    }
}
