package Tree;

import BasicClasses.NodeTree;

import java.util.HashMap;

/**
 * Created by divya on 6/12/16.
 */
public class VerticalSum {


    public void verticalSum(NodeTree root){
        if(root==null)
            return;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        verticalSumUtil(root, hashMap, 0);
        if(hashMap!=null)
            System.out.println(hashMap.entrySet());
    }

    private void verticalSumUtil(NodeTree root, HashMap<Integer, Integer> hashMap, int i) {

        if(root==null)
            return;
        verticalSumUtil(root.getLeft(),hashMap,i-1);
        if(hashMap.containsKey(i)){
            int k = hashMap.get(i);
            hashMap.put(i,k+root.getData());
        }
        else
            hashMap.put(i,root.getData());
        verticalSumUtil(root.getRight(),hashMap,i+1);
    }
}
