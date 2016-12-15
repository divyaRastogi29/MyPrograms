package DP;

import java.util.Scanner;

/**
 * Created by divya on 29/11/16.
 */
public class MaximumSubSegment {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(findLengthDP(arr,n-1));
        findLength(arr,n-1);
        System.out.println(maxV);
    }
static int maxV = Integer.MIN_VALUE;
    private static int findLength(int[] arr, int n) {
        if(n==0)
            return 1;
        int maxTillNow = findLength(arr,n-1);
        if(arr[n]>=arr[n-1]) {
            if(maxV<(maxTillNow+1))
                maxV = 1+maxTillNow;
            return 1 + maxTillNow;
        }
        return 1;

    }

    // n is the end point of array . As such table[n] stores the length of
    public static int findLengthDP(int[] arr,int n){
        int[] table =  new int[n+1];

        for(int i=0;i<=n;i++)
            table[i]=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(arr[j]>=arr[j-1])
                    table[j]=Math.max(1+table[j-1],table[j]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            System.out.print(table[i]+" ");
            if(table[i]>max)
                max=table[i];
        }
        System.out.println("\n");
        return max;
    }

}
