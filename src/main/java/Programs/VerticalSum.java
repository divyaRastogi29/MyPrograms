package Programs;

import BasicClasses.Node;
import BasicClasses.NodeTree;

/**
 * Created by divya on 6/6/16.
 */
public class VerticalSum {
    public static void main(String[] args){
        NodeTree root = new NodeTree(1);
        root = root.formBinaryTree();
      Node head = new Node();
        head.setData(0);
        head.setNext(null);
        head.setPrev(null);
        head = verticalSumUtil(root ,head);
        while(head.getPrev()!=null){
            head = head.getPrev();
        }
        while(head!=null){
            System.out.print("   "+head.getData());
            head = head.getNext();
        }
    }

    public static Node verticalSumUtil(NodeTree root , Node sum){
        sum.setData(root.getData()+sum.getData());
        if(root.getLeft()!=null) {
            if (sum.getPrev() == null){
                Node pr = new Node();
                pr.setData(0);
                pr.setNext(sum);
                pr.setPrev(null);
                sum.setPrev(pr);
            }
                verticalSumUtil(root.getLeft(), sum.getPrev());
        }
        if(root.getRight()!=null) {
            if(sum.getNext()==null){
                Node next = new Node();
                next.setData(0);
                next.setNext(null);
                next.setPrev(sum);
                sum.setNext(next);
            }
           verticalSumUtil(root.getRight(), sum.getNext());
        }
            return sum;

    }
}
