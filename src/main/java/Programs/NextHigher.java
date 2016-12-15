package Programs;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by divya on 6/6/16.
 */
public class NextHigher {
    public static void main(){
        NodeX head;
        Scanner s = new Scanner(System.in);
        head = new NodeX(s.nextInt());
        NodeX curr=head;
        for (int i=1;i<10;i++){
         curr.setNext(new NodeX(s.nextInt()));
            curr=curr.getNext();
        }
        Stack<NodeX> stack = new Stack<NodeX>();
         curr=head;
        NodeX max =null;
        while(curr!=null){
            stack.push(curr);
        }
       while (!stack.isEmpty()){
          NodeX temp = stack.pop();
           temp.setX(max);
           if(max==null)
               max=temp;
       }
    }


}
class NodeX {
    private int data;
    private NodeX next;
    private NodeX X;
    NodeX(int data){
        this.data=data;
        this.next=null;
        this.X=null;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public NodeX getNext() {
        return next;
    }
    public void setNext(NodeX next) {
        this.next = next;
    }
    public NodeX getX() {
        return X;
    }
    public void setX(NodeX x) {
        X = x;
    }

}