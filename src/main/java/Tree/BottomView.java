package Tree;

import BasicClasses.NodeTree;

import java.util.*;

/**
 * Created by divya on 6/12/16.
 */
public class BottomView {

    public static void main(String[] args){
        NodeTree root = new NodeTree(20);
        root = root.formBinaryTree();
        bottomView(root);
    }

    public static void bottomView(NodeTree root){
        if(root==null)
            return;
        Map<Integer,Integer> hashMap = new TreeMap<Integer, Integer>();
        Queue<NodeTree> queue = new LinkedList<NodeTree>();
        root.setHd(0);
        queue.add(root);
        while(!queue.isEmpty()){
            NodeTree node = queue.remove();

            hashMap.put(node.getHd(),node.getData());
            if(node.getLeft()!=null){
                node.getLeft().setHd(node.getHd()-1);
                queue.add(node.getLeft());
            }

            if(node.getRight()!=null){
                node.getRight().setHd(node.getHd()+1);
                queue.add(node.getRight());
            }

        }
        if(hashMap!=null)
            System.out.println(hashMap.entrySet());
    }


   /* private static void bottomViewUtil(HashMap<Integer, Integer> hashMap, NodeTree root, int i) {
        if(root==null)
            return;
        hashMap.put(i,root.getData());
        bottomViewUtil(hashMap,root.getLeft(),i-1);
        bottomViewUtil(hashMap,root.getRight(),i+1);
    }*/
}
