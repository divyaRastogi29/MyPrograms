package Tree;

import BasicClasses.NodeTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 6/12/16.
 */
public class LeftView {

    public static void main(String[] args){
        System.out.println("Hello");
        NodeTree root = new NodeTree(5);
        root = root.formBinaryTree();
     //   printRightView(root);
        printLeftView(root);
    }

    public static void printRightView(NodeTree root){

        Queue<NodeTree> queue = new LinkedList<NodeTree>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            NodeTree node = queue.remove();
            if(queue.peek()==null){
                if(!queue.isEmpty())
                    System.out.print(node.getData()+" ");
            }
            if(node==null)
                queue.add(null);
            else{
                if(node.getLeft()!=null)
                    queue.add(node.getLeft());
                if(node.getRight()!=null)
                    queue.add(node.getRight());
            }
        }
    }

    public static void printLeftView(NodeTree root){
        Queue<NodeTree> queue = new LinkedList<NodeTree>();
        queue.add(root);
        System.out.print(root.getData()+" ");
        queue.add(null);
        while (!queue.isEmpty()){
            NodeTree node = queue.remove();
            if(node==null){
                queue.add(null);
                if(queue.peek()!=null)
                System.out.print(queue.peek().getData()+" ");
            }

            else{
                if(node.getLeft()!=null)
                    queue.add(node.getLeft());
                if(node.getRight()!=null)
                    queue.add(node.getRight());
            }
        }
    }
    static int maxLevel=0;

    public static void recurLeftView(NodeTree root , int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.println(root.getData()+" ");
            maxLevel = level;
        }
         recurLeftView(root.getLeft(),level+1);
        recurLeftView(root.getRight(),level+1);
    }
}
