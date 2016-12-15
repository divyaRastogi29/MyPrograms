package Programs;

import BasicClasses.Node;

/**
 * Created by divya on 6/6/16.
 */
public class AddTwoNodes {
    Node AddTwoNodes(Node headX, Node headY){
        Node prev=null,head=null , curr;
        int carry =0;
        while((headX!=null)||(headY!=null)){
            int sum = carry + ((headX!=null)?headX.getData():0)+((headY!=null)?headY.getData():0);
            if(sum>9) {
                sum = sum % 10;
                carry = 1;
            }
           curr = new Node(sum);
            if(head==null) {
                head = curr;
            }
            else{
                prev.setNext(curr);
            }
            prev=curr;
            if(headX!=null)
                headX = headX.getNext();
            if(headY!=null)
                headY = headY.getNext();
        }
        if(carry==1){
            prev.setNext(new Node(1));
        }

        return  head;
    }
}
