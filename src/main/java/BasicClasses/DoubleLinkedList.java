package BasicClasses;

/**
 * Created by divya on 6/6/16.
 */
public class DoubleLinkedList {
    Node head;
    public DoubleLinkedList(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        newNode.setPrev(null);
        this.head = newNode ;
    }
}
