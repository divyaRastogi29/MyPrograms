package Amazon;

/**
 * Created by divya on 8/12/16.
 */
public class FindOccurencesInSortedArray {

    public static int findOccurences(int[] arr, int x){

        if(arr.length==0)
            return 0;
        return findOccurencesUtil(arr, x);
    }

    private static int findOccurencesUtil(int[] arr, int x) {

        int firstOccurence = findFirst(arr,x,0,arr.length-1);
        if(firstOccurence==-1)
            return firstOccurence ;
        int lastOccurence = findLast(arr,x,0,arr.length-1);
        return lastOccurence-firstOccurence+1;
    }

    private static int findLast(int[] arr, int x, int low, int high) {

        if(low<=high){

            int mid = (low+high)/2;

            if((mid==arr.length-1||arr[mid+1]>x)&&(arr[mid]==x))
                return mid ;
            else if(x>arr[mid])
                findLast(arr,x,mid+1,high);
            else
                findLast(arr,x,low,mid-1);
        }
        return -1 ;
    }

    private static int findFirst(int[] arr, int x, int low, int high) {

        if(low<=high){

            int mid = (low+high)/2;
            if((mid==0||x>arr[mid-1])&&arr[mid]==x)
                return mid;
            else if(x<arr[mid])
                return findFirst(arr,x,low,mid-1);
            else
                return findFirst(arr,x,mid+1,high);

        }
        return -1;
    }
}
