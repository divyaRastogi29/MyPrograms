package Programs;

import BasicClasses.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by divya on 18/5/16.
 */
public class Linking {
    public static void main(String[] args)throws IOException{
        BufferedReader p =new BufferedReader(new InputStreamReader(System.in));
        String[] s = p.readLine().split(" ");
        Node head = new Node();
        head.setData(Integer.parseInt(s[0]));
        head.setNext(null);
        Node nextNode,prevNode=head;
        for(int i=1;i<s.length;i++){
             nextNode = new Node();
            nextNode.setData(Integer.parseInt(s[i]));
            nextNode.setNext(null);
            prevNode.setNext(nextNode);
            prevNode=nextNode;
        }
    }


}

/*
class Node{
    private int data;
    private Node next;
    private Node prev;
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;}
    public void setPrev(Node prev) {
        this.prev = prev;}
}*/
