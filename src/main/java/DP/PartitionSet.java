package DP;

/**
 * Created by divya on 12/4/17.
 */

/*Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.
        If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of
        abs(sum(Subset1) – sum(Subset2)) should be minimum.*/
public class PartitionSet {

    static int sumTotal ;

    public static void main(String[] args) {
        int[] arr = {};
        for(int i=0;i<arr.length;i++){
            sumTotal += arr[i];
        }
    }

    public static int partitionSet(int[] arr, int i, int s1){
        if(i==-1)
            return Math.abs(s1-(sumTotal-s1));
        return Math.min(partitionSet(arr, i-1,s1+arr[i]), partitionSet(arr, i-1, s1));
    }

    public static int partitionSetDP(int[] arr){
        boolean[][] table = new boolean[arr.length+1][sumTotal+1];

        for(int j=0; j<=sumTotal; j++)
            table[0][j]= false;
        for(int i=0; i<=arr.length; i++)
            table[i][0]=true;

        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sumTotal;j++){
                table[i][j] = table[i-1][j];
                if(arr[i-1]<=j-1)
                    table[i][j] |= table[i-1][j-arr[i-1]];
            }
        }
        int diff = Integer.MAX_VALUE;
        for(int j=sumTotal/2;j>=0;j--){
            if(table[arr.length][j]==true ){
                diff = sumTotal - 2*j;
                break;
            }
        }
        return diff;
    }
}


