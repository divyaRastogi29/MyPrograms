package Programs;

import java.util.Scanner;

/**
 * Created by divya on 7/6/16.
 */
public class PrintStringCombinations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        combinations(st,0,"");
    }

    public static void combinations(String s, int i,String out){
        if(i==s.length())
            System.out.println("\n"+out);
        else{
            for(int k=i ;k<s.length() ;k++){
                combinations(s,i+1,out+"("+s.substring(i,k+1-i)+")");
            }
        }
    }
}
