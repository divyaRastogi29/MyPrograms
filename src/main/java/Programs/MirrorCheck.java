package Programs;

import BasicClasses.NodeTree;

/**
 * Created by divya on 6/6/16.
 */
public class MirrorCheck {
    Boolean MirrorCheck(NodeTree rootX, NodeTree rootY){
        if((rootX==null)&&(rootY==null))
            return true;
        if(((rootX==null)&&(rootY!=null))||((rootX!=null)&&(rootY==null)))
            return false;
        return ((rootX.getData()==rootY.getData())&&MirrorCheck(rootX.getLeft(),rootY.getRight())&&MirrorCheck(rootX.getRight(),rootY.getLeft()));
    }
}
