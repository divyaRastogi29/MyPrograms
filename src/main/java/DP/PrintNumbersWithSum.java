package DP;

/**
 * Created by divya on 14/11/16.
 */
public class PrintNumbersWithSum {
    public static void main(String[] args){
        int sum = 10;
        int[] arr={2, 5, 3, 6};
        System.out.println(findWays(arr,4,sum));
    }

    private static int findWays(int[] arr, int m, int sum) {
        if(sum==0) {
            return 1;
        }
        if(sum<0)
            return 0;
        if((m<=0)&&(sum>=1))
            return 0;
        return findWays(arr,m-1,sum)+findWays(arr,m,sum-arr[m-1]);

    }

    public static int findDpWays(int[] arr, int m, int sum){
        int[] table = new int[sum+1];
        for(int i=0;i<sum+1;i++)
            table[i] = 0;
        table[0]=1;

        for(int i=1;i<sum;i++){
            for(int j=arr[i];j<=sum;j++){
                table[j]+=table[j-arr[i]];
            }
        }

        return table[sum];
    }
}

