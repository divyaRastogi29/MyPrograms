package Tree;

import java.util.Stack;

/**
 * Created by divya on 4/4/17.
 */
public class IfPreOrderIsBst {

    boolean isPreorderBst(int[] arr, int i, int j){
        int pivot = findNextHigher(arr, i);
        // Now i+1 to pivot-1 is left tree of i
        // pivot to j is right subtree of i

        if(checkRightTreeWithAllHigherValuesThanCurrNode(arr, i,pivot,j))
            return isPreorderBst(arr, i+1, pivot-1)&&isPreorderBst(arr, pivot, j);
        else
            return false ;
    }

    private boolean checkRightTreeWithAllHigherValuesThanCurrNode(int[] arr, int i, int pivot, int j) {
        for(int k=pivot; k<j;k++){
           if(arr[i]<arr[k])
               return false ;
        }
        return true ;
    }

    public int findNextHigher(int[] arr, int i){
        for(int k=i+1 ;k<arr.length; k++){
            if(arr[k]>arr[i])
                return k;
        }
        return -1;
    }


    boolean isPreorderBSTWithNGE(int[] pre){

        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE ;

        for(int i=0;i<pre.length; i++){
            if(pre[i]<root)
                return false;

            while(!stack.isEmpty()&&(stack.peek()<pre[i])){
                root = stack.peek();
                stack.pop();
            }

            stack.push(pre[i]);
        }
        return true;
    }
}
