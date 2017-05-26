package Programs;

/**
 * Created by divya on 20/4/17.
 */

/*if array is of size n , then we can do maximum n-1 merges to make it a single element and only adjacent
* elements can be merged*/
public class MinimumMergeToMakeArrayPalindromic {

    public int minimumMerges(int[] arr){

        int count = 0;

        for(int i=0, j=arr.length-1 ; i<=j ; ){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
           else if(arr[i]>arr[j]){
                j--;
                arr[j] = arr[j]+arr[j+1];
                count++;
            }
            else if(arr[j]>arr[i]){
               i++;
               arr[i]=arr[i]+arr[i-1];
               count++;
            }

        }

        return count ;
    }

   /* public int minimumMerges(int[] arr, int i, int j){
        int count1=0, count2=0 , count3=0 ;
        if(!(i<j))
            return 0;
        if(arr[i]==arr[j])
            return minimumMerges(arr,i+1,j-1);

        if(arr[i]+arr[i+1]==arr[j])
            count1 = 1+minimumMerges(arr, i+2, j-1);
        if(arr[i]==arr[j]+arr[j-1])
            count2 = 1+minimumMerges(arr,i+1,j-2);
        if(arr[i]+arr[i+1]==arr[j]+arr[j-1])
            count3 = 1+minimumMerges(arr,i+2, j-2);

     return Math.min(count1, Math.min(count2,count3));

    }*/
}
