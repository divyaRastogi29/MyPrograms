package Heap;

import java.util.Scanner;

/**
 * Created by divya on 8/11/16.
 */
public class HeapSorting {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0 ; i<10;i++){
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        for(int i=0; i<10;i++)
            System.out.print(arr[i]+" ");
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for(int i = n/2-1; i>=0; i--){
           heapify(arr, n, i);
        }

        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if((left<n)&&(arr[left]>arr[largest]))
            largest = left;
        if((right<n)&&(arr[right]>arr[largest]))
            largest = right;
        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }

    }
}
