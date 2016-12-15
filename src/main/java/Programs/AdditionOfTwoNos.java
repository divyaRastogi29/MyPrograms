package Programs; /**
 * Created by divya on 6/6/16.
 */

import BasicClasses.Node;

public class AdditionOfTwoNos {
    Node AdditionOfTwoNos(Node headX, Node headY){
        if(headX==null)
            return headY;
        if(headY==null)
            return headX;
        Node currX = headX.getNext() , currY = headY.getNext(), headZ, prevZ;
        int carry = 0;
        int sum = headX.getData()+headY.getData();
        if(sum>9) {
            carry = 1;
            sum=sum%10;
        }
        headZ = new Node(sum);
        prevZ = headZ;
        while((currX!=null)&&(currY!=null)){
          sum = currX.getData()+currY.getData()+carry;
            if(sum>9){
                carry = 1;
                sum=sum%10;
            }
            prevZ.setNext(new Node(sum));
            prevZ = prevZ.getNext();
            currX = currX.getNext();
            currY = currY.getNext();
        }
        while(currY!=null){
            sum = currY.getData()+carry;
            if(sum>9){
                carry = 1;
                sum=sum%10;
            }
            currY.setData(sum);
            prevZ.setNext(currY);
            currY = currY.getNext();
            prevZ = prevZ.getNext();
        }
        while(currX!=null){
            sum = currX.getData()+carry;
            if(sum>9){
                carry = 1;
                sum=sum%10;
            }
            currX.setData(sum);
            prevZ.setNext(currX);
            prevZ = prevZ.getNext();
        }
        if(carry==1){
            prevZ.setNext(new Node(1));
        }
    return headZ;
    }
}
