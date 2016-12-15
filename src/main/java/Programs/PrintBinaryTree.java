package Programs;

import BasicClasses.NodeTree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by divya on 4/6/16.
 */
public class PrintBinaryTree {
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

        printBinary(node);
    }
    public static void printBinary(NodeTree node){
        NodeTree root = node;
        if(node==null)
            return;
        Stack<NodeTree> stack = new Stack<NodeTree>();
        while(true){
            while(root!=null){
                stack.push(root);
                root = root.getRight();
            }
            if(stack.isEmpty()){
                break;
            }
            root=stack.pop();
            int level = level(node, root);
            for(int i=1;i<=level;i++){
                System.out.print("      ");
            }
            System.out.print(root.getData());
            System.out.println("\n");
            root = root.getLeft();
        }
    }

    public static int level(NodeTree node, NodeTree root){
        LinkedList<NodeTree> queue = new LinkedList<NodeTree>();
        queue.addLast(node);
        queue.addLast(null);
        int l =1;
        while(!queue.isEmpty()){
            NodeTree temp = queue.removeFirst();
            if(temp==null){
                l++;
                queue.addLast(null);
            }
            else {
                if (temp.getData() == root.getData()) {
                    return l;
                }
                if(node.getLeft()!=null)
                    queue.addLast(temp.getLeft());
                if(node.getRight()!=null)
                    queue.addLast(temp.getRight());
            }
        }
        return 0;
    }
}
