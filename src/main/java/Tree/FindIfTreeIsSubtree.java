package Tree;

import BasicClasses.NodeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by divya on 3/4/17.
 */
public class FindIfTreeIsSubtree {

    public boolean findIfSubtree(NodeTree subRoot , NodeTree root){
        List<String> T_inorder = getInorderString(root);
        List<String> T_preOrder = getPreorderString(subRoot);
        List<String> S_inorder = getInorderString(subRoot);
        List<String> S_preOrder = getPreorderString(root);
        return  (findSubstring(S_inorder, T_inorder)&&findSubstring(S_preOrder, T_preOrder));
    }


    public List<String> getInorderString(NodeTree root){
        List<String> inorder = new ArrayList<>();
        Stack<NodeTree> stack = new Stack<>();
        while (true){
            while (root!=null){
               stack.push(root);
               root = root.getLeft();
            }

            if(stack.isEmpty())
                break;
            root = stack.pop();
            inorder.add(root.getData()+"");
            root = root.getRight();
        }

        return inorder ;

    }

    public List<String> getPreorderString(NodeTree root){
        List<String> preOrder = new ArrayList<>();
        Stack<NodeTree> stack = new Stack<>();
        while (true){
            while (root!=null){
                preOrder.add(root.getData()+"");
                stack.push(root);
                root = root.getLeft();
            }

            if(stack.isEmpty())
                break;
            root = stack.pop();
            root = root.getRight();
        }
        return preOrder ;
    }


    public boolean isSubstring(List<String> sub, List<String> complete){
        int i=0, j=0;
        for(i=0;i<complete.size();i++){
            for(j=0;j<sub.size()&&i+j<complete.size();j++){
                if(!sub.get(j).equals(complete.get(i+j))) {
                    break;
                }
            }

            if(j==sub.size())
                return true;
        }

        return false ;
    }

    public boolean findSubstring(List<String> sub, List<String> complete){
        int small = sub.size();
        int large = complete.size();
        for(int i=0,j=0; i<large;i++){
            if(sub.get(j)==complete.get(i))
                if(isIdentical(sub, complete, j, i))
                    return true;
        }
        return false;
    }

    private boolean isIdentical(List<String> sub, List<String> complete, int j, int i) {

        for(int k=i;k<sub.size()+i;k++){
            if(sub.get(j)!=complete.get(i))
                return false;
        }
        return true;
    }
}

