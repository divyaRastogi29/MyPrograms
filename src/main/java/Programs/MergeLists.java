package Programs;

import BasicClasses.Node;

/**
 * Created by divya on 26/5/16.
 */
public class MergeLists {
    public void mergeLists(Node head1, Node head2){
        Node list1 = head1 , list2 = head2;
        while((list1!=null)&&(list2!=null)){
            if(list2.getData()<list1.getData()){
                int temp = list1.getData();
                list1.setData(list2.getData());
                list2.setData(temp);
            }

            Node temp = list2;
            if((list2.getNext()!=null)&&(list2.getData()>list2.getNext().getData())){
                list2 = list2.getNext();
                Node ptr =temp, prev=null ;
                while((ptr!=null)&&(ptr.getData()<temp.getData())){
                    prev = ptr;
                    ptr = ptr.getNext();
                }
                prev.setNext(temp);
                temp.setNext(ptr);
            }
            list1=list1.getNext();
        }

    }

    public int length(Node head){
        int l = 0;
        while(head!=null){
            head = head.getNext();
            l++;
        }
        return l;
    }
}
