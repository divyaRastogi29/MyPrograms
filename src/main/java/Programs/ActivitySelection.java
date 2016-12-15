package Programs;

import java.util.Scanner;

/**
 * Created by divya on 16/6/16.
 */
public class ActivitySelection {
   static int n; static int[] ss, fs;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("\nNumber of inputs");
        n=6;
         ss =  new int[]{1, 3, 0, 5, 8, 5};
         fs =  new int[]{2, 4, 6, 7, 9, 9};
        activity(ss, fs);
    }

    public static void activity(int[] ss, int[] fs){
        sort(ss,fs);
        for(int i=0;i<n;i++){
            System.out.print("  "+ss[i]);
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.print("  "+fs[i]);
        }
       int i=0;
        for(int j=1;j<n;j++){
            if(ss[j]>fs[i])
                System.out.println("  "+j);
                i=j;
        }
    }

    public static void sort(int[] ss, int[] fs){
        for(int i = n-1;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(fs[j]>fs[j+1]){
                    int temp = fs[j];
                    fs[j] = fs[j+1];
                    fs[j+1] = temp;
                    temp = ss[j];
                    ss[j]=ss[j+1];
                    ss[j+1]=temp;
                }
            }
        }
    }
}
