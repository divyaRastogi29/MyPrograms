package Median;

import java.util.Scanner;

/**
 * Created by divya on 9/11/16.
 */
public class InsertionSort {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        sortByInsert(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        findMedian(arr);
    }

    private static void findMedian(int[] arr) {
        int l = arr.length ;
        if((l%2)==0)
            System.out.println((arr[arr.length/2]+arr[(arr.length/2)-1])/2);
        else
            System.out.println(arr[(arr.length)/2]);
    }

    private static void sortByInsert(int[] arr) {
        int i = 0;
        for(int j=1;j<arr.length;j++){
            int temp = arr[j];
            int k=j-1;
            while((k>=0)&&(arr[k]>temp)){
                arr[k+1]=arr[k];
                k--;
            }
            arr[k+1]=temp;
        }
    }
}
