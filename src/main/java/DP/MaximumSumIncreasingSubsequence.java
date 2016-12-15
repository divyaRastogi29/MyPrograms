package DP;

/**
 * Created by divya on 14/12/16.
 */
public class MaximumSumIncreasingSubsequence {

    static int max_sum = Integer.MIN_VALUE;
    public static int maxSumIncrSubsequence(int[] arr, int n){

        if(n==1)
            return arr[n-1];

        int curr_sum = arr[n-1];
        for(int i=0;i<n;i++){
            int sub_sum = maxSumIncrSubsequence(arr,i+1);
            if((arr[n-1]>arr[i])&&(sub_sum+arr[n-1]>curr_sum))
                curr_sum = sub_sum+arr[n-1];
        }

        if(curr_sum>max_sum)
            max_sum = curr_sum;
        return max_sum ;
    }

    public static int maxSumIncrSubsequenceDP(int[] arr, int n){
        int[] tableSum = new int[n];

        for(int i=0;i<n;i++){
          tableSum[i] = arr[i];
        }
        int max_sum=tableSum[0];

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if((arr[j]<arr[i])&&(tableSum[j]+arr[i]>tableSum[i]))
                    tableSum[i]=tableSum[j]+arr[i];
            }
            if(tableSum[i]>max_sum)
                max_sum=tableSum[i];
        }
       return max_sum;
    }
}
