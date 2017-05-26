package DP;

/**
 * Created by divya on 6/4/17.
 */
public class SubsetSum {

    public boolean isSubsetSum(int[] arr, int n, int sum){
        if(sum==0)
            return true;
        if(n==0&&sum!=0)
            return false;
        if(arr[n-1]>sum)
            return isSubsetSum(arr, n-1,sum);
        else
            return isSubsetSum(arr, n-1, sum-arr[n])|| isSubsetSum(arr, n-1, sum);

    }

    public boolean isSubSetSumDP(int[] arr, int sum){
        boolean[][] table = new boolean[sum+1][arr.length+1];


        for(int i=0;i<=arr.length;i++){
            table[0][i] = true;
        }

        for(int j=1;j<=sum;j++){
            table[j][0]=false;
        }

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=arr.length;j++){
               if(arr[j-1]>i)
                   table[i][j] = table[i][j-1];
               else
                   table[i][j] = table[i][j-1] || table[i-arr[j-1]][j-1];
            }
        }

        return table[sum][arr.length];
    }
}
