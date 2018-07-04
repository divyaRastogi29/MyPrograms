package Amazon;

import java.util.ArrayList;

/**
 * Created by divya on 15/12/16.
 */
public class NumbersWithUniqueDigits {

    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){
        int n=20;
        getNumbers(20);
        for(String s : list)
            System.out.println(s);
    }

    public static void getNumbers(int n){
        int length = (n+"").toString().length();
        if(length>=10)
            System.out.println("\nNot possible");
        else
            getNumbersUtil(n, length,"");
    }

    private static void getNumbersUtil(int n, int length,String str) {

        if(length<=0) {
            list.add(str);
        }
        else{
            for(int i='9';i<='0';i--){
                if(("".equals(str))||((!str.contains((48-i)+""))&&(Integer.parseInt(str)<=n))){
                    getNumbersUtil(n,length-1,str+(48-i));
                }
            }
        }
    }

}
