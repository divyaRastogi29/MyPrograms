package DP;

/**
 * Created by divya on 14/12/16.
 */
public class LongestIncreasingSubsequence {


    /*This method returns lis as follows : Here it will be checked that if n is taken into longest increasing subsequence then
    * what will be lis*/
    static int max_lis = Integer.MIN_VALUE;
    public int longestIncreasingSubsequence(int[] arr, int n){
        if(n==1)
            return 1;
        int curr_lis = Integer.MIN_VALUE ;

        for(int i=0;i<n;i++){
            int sub_lis = longestIncreasingSubsequence(arr, i+1);

            if((arr[i]<arr[n-1])&&(sub_lis+1>curr_lis))
                curr_lis = 1+sub_lis;
        }

        if(max_lis<curr_lis)
            max_lis = curr_lis ;
        return curr_lis;
    }


    public int longestIncreasingSubsequenceDP(int[] arr, int n){
        int[] table = new int[n];
        String str = "";
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
            table[i] = 1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if((arr[j]<arr[i])&&(table[j]+1<table[i])){
                    table[i] = 1+table[j];
                }
            }
            if(max<table[i])
                max = table[i];
        }
        return max ;
    }
}
