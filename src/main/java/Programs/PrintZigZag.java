package Programs;

import BasicClasses.NodeTree;

import java.util.Stack;

/**
 * Created by divya on 4/6/16.
 */
public class PrintZigZag {
    public static void main(String[] args){
        NodeTree node = new NodeTree(1);
        node=node.formBinaryTree();
         printZigZag(node);
    }

    public static void printZigZag(NodeTree node){
        int leftToRight =1;
        Stack<NodeTree> currentLevel = new Stack<NodeTree>();
        Stack<NodeTree> nextLevel = new Stack<NodeTree>();
        currentLevel.push(node);
        while(!currentLevel.isEmpty()){
            NodeTree temp = currentLevel.pop();
            System.out.print(" "+temp.getData());
                if (leftToRight == 1) {
                    if (temp.getRight() != null)
                        nextLevel.push(temp.getRight());
                    if (temp.getLeft() != null)
                        nextLevel.push(temp.getLeft());
                } else if (leftToRight == 0) {
                    if (temp.getLeft() != null)
                        nextLevel.push(temp.getLeft());
                    if (temp.getRight() != null)
                        nextLevel.push(temp.getRight());
                }
            if(currentLevel.isEmpty()){
                System.out.println("\n");
                currentLevel = nextLevel;
                nextLevel = new Stack<NodeTree>();
                leftToRight = 1-leftToRight;
            }
        }
    }
}
