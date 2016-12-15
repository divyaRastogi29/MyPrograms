package Programs;

/**
 * Created by divya on 8/6/16.
 */
public class QuickSort {
    static int [] a={2,34,1,9,8,11};

    public static void main(String[] args){
        quickSort(0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print("  "+a[i]);
    }

    public static void quickSort(int left, int right){
        int pivot = a[right];
        int partition = partition(left, right, pivot);
        quickSort(left,partition-1);
        quickSort(partition+1, right);
    }

    public static int partition(int left, int right, int pivot) {
        while (true) {
            while (a[left] <= pivot)
                left++;
            while (a[right] >= pivot)
                right--;
            if (left >= right)
                break;
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
        return 0;
    }

}
