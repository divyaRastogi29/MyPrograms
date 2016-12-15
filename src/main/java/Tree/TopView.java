package Tree;

import BasicClasses.NodeTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Created by divya on 7/12/16.
 */
public class TopView {

    public static void main(String[] args){
        NodeTree root = new NodeTree(1);
        root = root.formBinaryTree();
        topView(root);
    }

    public static void topView(NodeTree root){
        if(root==null)
            return;
        Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
        topViewUtil(root, map);
    }

    private static void topViewUtil(NodeTree root, Map<Integer, Integer> map) {

        Queue<NodeTree> queue = new LinkedList<NodeTree>();
        root.setHd(0);
        queue.add(root);
        while(!queue.isEmpty()){
            NodeTree node = queue.remove();
            int hd = node.getHd();

            if(map.get(hd)==null){
               map.put(hd,node.getData());
            }

            if(node.getLeft()!=null){
                node.getLeft().setHd(hd-1);
                queue.add(node.getLeft());
            }

            if(node.getRight()!=null){
                node.getRight().setHd(hd+1);
                queue.add(node.getRight());
            }

        }

        if(map!=null)
            System.out.println(map.entrySet());
    }
}
