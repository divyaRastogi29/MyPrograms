package Programs;

/**
 * Created by divya on 3/4/17.
 */
public class SortedRotatedArray {



    public int findPivot(int[] arr, int low, int high){

        if(low>high)
            return -1;
        if(low==high)
            return low ;

        int mid = (low+high)/2;
        if((mid<high)&&(arr[mid]>arr[mid+1]))
            return mid;
        if((mid>low)&&(arr[mid-1]>arr[mid]))
            return mid-1;
        if(arr[mid]>arr[high])
          return   findPivot(arr, mid+1,high);
       return findPivot(arr,low, mid-1);

    }
}
