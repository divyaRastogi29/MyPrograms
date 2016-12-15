package Amazon;

import BasicClasses.NodeTree;

/**
 * Created by divya on 7/12/16.
 */
public class RootToLeafPathWithSum {

    public static void main(String[] args){
        NodeTree root = new NodeTree(1);
        root = root.formBinaryTree();
        int[] paths = new int[3];
        printPathsTwo(root, 9, paths,0);
    }

   /* public static void printPaths(NodeTree root, int sum, int[] paths, int index){
        if((root==null)&&(sum==0)){
            for(int i=0;i<index;i++){
                System.out.println(paths[i]);
            }
        }
        else if(((root!=null)&&(sum<=0))||((root==null)&&(sum>0))){
            System.out.println("\nNot Possible");
        }
        else if(root!=null){
            paths[index] = root.getData();
            printPaths(root.getLeft(), sum - root.getData(), paths, index + 1);
            printPaths(root.getRight(), sum - root.getData(), paths, index + 1);
        }
    }*/

    public static void printPathsTwo(NodeTree root, int sum, int[] paths, int index){
        if((root.getRight()==null)&&(root.getLeft()==null)&&(sum-root.getData()==0)){
            paths[index]=root.getData();
            for(int i=0;i<=index;i++){
                System.out.println(paths[i]);
            }
        }
        else if(sum<=0){
            System.out.println("\nNot Possible");
        }
        else {
            paths[index] = root.getData();
            if (root.getLeft() != null)
                printPathsTwo(root.getLeft(), sum - root.getData(), paths, index + 1);
            if (root.getRight() != null)
                printPathsTwo(root.getRight(), sum - root.getData(), paths, index + 1);
        }

    }
}
