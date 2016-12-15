package Programs;

import java.util.Scanner;

/**
 * Created by divya on 24/5/16.
 */
public class FindDuplicate {
    public static void main(String[] args){
        Scanner s = new  Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int count = n;
        for(int i=0,j=n-1;i<j;){
            int sum = a[i]+a[j];
            if(sum>0){
              j--;
            }
            if(sum<0){
               i++;
            }
            if(sum==0){
                i++;
                count--;
            }
        }
        System.out.println("\n\n"+count);
    }
}
