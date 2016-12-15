package Programs;

import BasicClasses.NodeTree;

import java.util.LinkedList;

/**
 * Created by divya on 4/6/16.
 */
public class DensityOfTree {
    public static void main(String[] args){
        NodeTree node = new NodeTree(1);
        NodeTree node1 = new NodeTree(2);
        NodeTree node2 = new NodeTree(3);
        node.setLeft(node1);
        node.setRight(node2);
        NodeTree node3 = new NodeTree(4);
        NodeTree node4 = new NodeTree(5);
        node1.setLeft(node3);
        node1.setRight(node4);
        NodeTree node5 = new NodeTree(6);
        NodeTree node6 = new NodeTree(7);
        node2.setLeft(node5);
        node2.setRight(node6);
        System.out.println("\nStarted");
        float f =FindDensity(node);
        System.out.println("\n"+f);
    }
    public static float FindDensity(NodeTree node){
        if(node==null)
            return 0;
        LinkedList<NodeTree> queue = new LinkedList<NodeTree>();
        queue.addLast(node);
        queue.addLast(null);
        float h=0;
        float size = 0;
        while(!queue.isEmpty()){
            NodeTree temp = queue.removeFirst();
            if(temp==null){
                h=h+1;
                if(!queue.isEmpty())
                queue.addLast(null);
            }
            else{
                size=size+1;
                if(temp.getLeft()!=null)
                    queue.addLast(temp.getLeft());
                if(temp.getRight()!=null)
                    queue.addLast(temp.getRight());

            }
        }
        System.out.println("\nHeight : "+h);
        System.out.println("\nSize : "+size);
        return (size/h);
    }
}
