package DP;

import java.util.Scanner;

/**
 * Created by divya on 15/11/16.
 */
// price[i][j] = Math.min(price[i-1][j-i]+arr[i-1],price[i-1][j]);
public class GetMinimumPrice {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases-->0){
            int n= s.nextInt();
            int k =s.nextInt();
            int[] arr = new int[k];
            for(int i =0;i<k;i++){
                arr[i] = s.nextInt();
            }
            int p = getDPMinimumPrice(arr,5);
            if(p>0)
                System.out.println(p);
            else
                System.out.println("-1");
        }

    }

    public static int getMinimumPrice(int[] arr, int k){
        if(k<=0)
            return 0;
        int minPrice = Integer.MAX_VALUE ;
        for(int i=1;i<=k;i++){
            if(arr[i-1]!=-1) {
                int price = arr[i - 1] + getMinimumPrice(arr, k - i);
                if (price < minPrice)
                    minPrice = price;
            }
        }
        return minPrice;
    }

    public static int getDPMinimumPrice(int[] arr, int k){
        int[] T = new int[k+1];
       for(int i=0;i<k;i++){
           T[i]=arr[i];
       }
        T[k]=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            for(int j=0;j<i;j++){
                T[i] = Math.min(arr[j]+T[i-j-1],T[i]);
            }
        }
        return T[k];
    }


}
