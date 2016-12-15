package Tree;

import BasicClasses.NodeTree;

/**
 * Created by divya on 7/12/16.
 */
public class SwapNodesAtKthLevel {

    public NodeTree swapNodes(NodeTree root, int level, int k) {
        if ((root == null) || (k <= 0) || (level >= k))
            return root;
        swapNodes(root.getLeft(), level + 1, k);
        swapNodes(root.getRight(), level + 1, k);

        if ((level % k) == 0) {
            NodeTree temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }
        return root;
    }
}


