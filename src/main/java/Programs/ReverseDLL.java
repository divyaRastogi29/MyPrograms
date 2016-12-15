package Programs;

import BasicClasses.Node;

/**
 * Created by divya on 8/6/16.
 */
public class ReverseDLL {
    public Node reverseDLL(Node head){
        Node prev = null , curr = head,temp;
        while(curr!=null){
            temp = curr.getNext();
            curr.setNext(prev);
            curr.setPrev(temp);
            prev=curr;
            curr = curr.getPrev();
        }
        return prev;
    }
}
