package Median;

import BasicClasses.NodeTree;

import java.util.Scanner;

/**
 * Created by divya on 10/11/16.
 */
public class HeapSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
       printMedian(arr) ;
    }

    private static void printMedian(int[] arr) {
        int m = 0 ;
        NodeTree leftMaxHeap = null;
        NodeTree rightMinHeap = null;

        for(int i = 0;i<arr.length; i++){
            m = getMedian(arr[i], m, leftMaxHeap,rightMinHeap);
        }
    }

    public static int getHeightOfHeap(NodeTree node){
        if(node == null)
            return 0 ;
        int left = getHeightOfHeap(node.getLeft());
        int right = getHeightOfHeap(node.getRight());
        int max = left ;
        if(right>left)
            max = right;
        return (1+max) ;
    }

    private static int getMedian(int i, int m, NodeTree leftMaxHeap, NodeTree rightMinHeap) {
        int leftHeight = getHeightOfHeap(leftMaxHeap);
        int rightHeight = getHeightOfHeap(rightMinHeap);
         if(leftHeight==rightHeight){
              if(i<m){

              }
             else{

              }
         }
        else if(leftHeight<rightHeight){
              if(i<m){

              }
             else{

              }
         }
        else{
             if(i<m){

             }
             else{

             }
         }
        return 0;
    }

    private static void insert(NodeTree node , int i){

    }
}
