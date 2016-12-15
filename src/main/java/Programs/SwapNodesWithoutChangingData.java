package Programs;

import BasicClasses.Node;

/**
 * Created by divya on 6/6/16.
 */
public class SwapNodesWithoutChangingData {
    SwapNodesWithoutChangingData(Node head, int x, int y){
        if(x==y)
         return;
        Node prevX=null , currX=head;
        while(currX!=null){
            if(currX.getData()==x)
                break;
            prevX = currX;
            currX = currX.getNext();
        }
        Node prevY = null, currY  =head;
        while(currY!=null){
          if(currY.getData()==y)
              break;
            prevY=currY;
            currY = currY.getNext();
        }
        if((currX==null)||(currY==null))
            return;
        if(prevX!=null)
            prevX.setNext(currY);
        else
         head = currY;
       if(prevY!=null)
           prevY.setNext(currX);
        else
           head=currX;
        Node tempX = currX.getNext();
        Node tempY = currY.getNext();
        currX.setNext(tempY);
        currY.setNext(tempX);
    }
}
