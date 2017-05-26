package Programs;

/**
 * Created by divya on 20/4/17.
 */

/*
Maximum sum such that no two elements are adjacent
*/
public class MaximumSumSuchThatNoTwoElementsAreAdjacent {


    public int maxSum(int[] arr, int i){

        if(i>=arr.length)
            return 0;

      return Math.max(arr[i]+maxSum(arr,i+2), maxSum(arr,i+1));
    }

    public int findMaxSum(int[] arr){

        int incl = arr[0];
        int excl = 0;

        for(int i=1; i<arr.length; i++){

            int max = incl>excl ? incl:excl ;

            incl = excl+arr[i];
            excl = max ;
        }
      return incl>excl?incl:excl ;
    }
}
