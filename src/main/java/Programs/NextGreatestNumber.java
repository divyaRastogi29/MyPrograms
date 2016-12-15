package Programs;

import java.util.Scanner;

/**
 * Created by divya on 16/6/16.
 */
public class NextGreatestNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        nextGreatest(st);
    }
    public static void nextGreatest(String s){
        int i;String next="";
        for(i=s.length()-1;i>0;i--){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr>prev)
                break;
        }

        if(i==0)
            System.out.println("\nNot Possible");
        else{
            for(int j=0;j<(i-1);j++){
                next = next + s.charAt(j);
            }
            next = next+s.charAt(s.length()-1);
            next = next+s.charAt(i-1);
            for(int k = s.length()-2;k>(i-1);k--)
                next = next + s.charAt(k);
            System.out.println("\n"+next);
        }
    }
}
