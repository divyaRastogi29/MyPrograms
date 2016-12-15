package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by divya on 21/5/16.
 */
public class HeapSorting {
    public static void main(String[] args)throws IOException{
        BufferedReader p= new BufferedReader(new InputStreamReader(System.in));
        String[] s = p.readLine().split(" ");
        int[] a = new int[s.length];
        for(int i = 0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Heap h = new Heap(a,a.length);
       h= buildHeap(h);
    }

    public static Heap buildHeap(Heap h){
        if(h==null)
            return null;
            int n = h.getCount();
            for(int i=(n-1)/2;i>=0;i--){
              h=  percolateDown(h,i);
            }
        int[] a= h.getArray();
        System.out.println("\n");
        for(int i=0;i<a.length;i++){
            System.out.print("  "+a[i]);
        }
        return h;
    }

    public static Heap percolateDown(Heap h,int i){
        int left = h.getLeft(i, h);
        int right = h.getRight(i, h);
        int max;
        int[] a = h.getArray();
        if((left!=-1)&&(a[left]>a[i]))
            max=left;
        else
            max=i;
        if((right!=-1)&&(a[right]>a[max]))
            max=right;
        if(max!=i){
            int temp = a[max];
            a[max]=a[i];
            a[i]=temp;
            h.setArray(a);
          h=  percolateDown(h,max);
        }
        return h;
    }



}
