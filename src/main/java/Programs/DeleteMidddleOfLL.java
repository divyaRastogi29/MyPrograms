package Programs;

import BasicClasses.Node;

/**
 * Created by divya on 9/6/16.
 */
public class DeleteMidddleOfLL {
    public Node DelMidOfLL(Node head){
      if(head==null)
          return null;
        Node slow=head,fast=head,prev=null;
        while((fast!=null)&&(fast.getNext()!=null)){
            prev=slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if(prev!=null)
        prev.setNext(slow.getNext());
        else
        head=null;
        return head;
    }
}
