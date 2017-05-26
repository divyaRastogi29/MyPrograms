package Amazon;

import BasicClasses.NodeTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by divya on 22/3/17.
 */
public class PrintBinaryTreeinVerticalOrder {

    public void printVerical(NodeTree root, HashMap<Integer,List<NodeTree>> map, int verticalOrder){
        if(root==null)
            return;
        if(map.containsKey(verticalOrder)){
            map.get(verticalOrder).add(root);
        }
        else{
            List<NodeTree> list = new ArrayList<>();
            list.add(root);
            map.put(verticalOrder,list);
        }

        if(root.getLeft()!=null)
            printVerical(root.getLeft(), map,verticalOrder-1);
        if(root.getRight()!=null)
            printVerical(root.getRight(), map, verticalOrder+1);

    }
}
