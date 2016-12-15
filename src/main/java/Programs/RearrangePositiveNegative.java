package Programs;

import java.util.Scanner;

/**
 * Created by divya on 24/5/16.
 */
public class RearrangePositiveNegative {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        int i=0,j=n-1;
      while(i<j){
          while(a[i]>0)
              i++;
          while(a[j]<0)
              j--;
          if(i<j)
          {
              int temp = a[i];
              a[i]=a[j];
              a[j]=temp;
          }
      }
        if((i==0)||(i==n))
            System.out.println("\nAll nos are positive or negative");
         int k=0;
        while((k<n)&&(i<n)){
           int temp = a[k];
            a[k]=a[i];
            a[i]=temp;
            k=k+2;
            i=i+1;
        }

        for(i =0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
}
