package TopDs;

import BasicClasses.NodeTree;

import java.util.LinkedList;

/**
 * Created by divya on 9/11/16.
 */
public class BfsTree {

    public void BfsTree(NodeTree root){
        LinkedList<NodeTree> queue = new LinkedList<NodeTree>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
         NodeTree node = queue.poll();
            if(node==null)
                queue.add(null);
            else {
                if(node.getLeft()!=null)
                queue.add(node.getLeft());
                if(node.getRight()!=null)
                    queue.add(node.getRight());
            }
        }
    }
}
