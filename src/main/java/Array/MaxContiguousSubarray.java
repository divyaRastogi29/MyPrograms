package Array;

/**
 * Created by b0200901 on 6/29/2018
 */
public class MaxContiguousSubarray {


    public int maxContiguousSubarray(int[] arr){
        int maxSoFar=0;
        int maxEndingHere=0;
        for(int i=0; i<arr.length; i++){
            maxEndingHere += arr[i];
            if(maxEndingHere>maxSoFar)
                maxSoFar=maxEndingHere;
            if(maxEndingHere<0)
                maxEndingHere=0;
        }
        return maxSoFar;
    }
}
