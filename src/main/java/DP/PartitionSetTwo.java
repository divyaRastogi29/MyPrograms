package DP;

/**
 * Created by divya on 24/4/17.
 */

/*totalSum-2*subSum*/
public class PartitionSetTwo {

    public int partitionSet(int[] arr, int subSum, int totalSum, int i){

        if(i<0)
            return Math.abs(subSum-(totalSum-subSum));
        return Math.min(partitionSet(arr, subSum,totalSum, i-1),
                partitionSet(arr, subSum+arr[i],totalSum,i-1));
    }



}
