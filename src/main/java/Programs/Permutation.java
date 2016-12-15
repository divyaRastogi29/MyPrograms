package Programs;

import java.util.Scanner;

/**
 * Created by divya on 29/5/16.
 */
public class Permutation {
    static int l;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        l = str.length();
        permutate(str);
    }

    public static String permutate(String str) {
        if ("".equals(str))
            return "";
        for (int i = 0; i < l; ) {


        }
        return "";
    }
}