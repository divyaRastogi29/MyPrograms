import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by divya on 25/10/16.
 */
public class Dictionary {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        boolean a = findFirst(s1.toLowerCase(), s2.toLowerCase());
        System.out.println("\n"+a);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        for(int i : arr){
            System.out.println(i);
        }
    }

    private static boolean findFirst(String s1, String s2) {

        boolean s1IsLarge = false ;
        int l1 = s1.length();
        int l2 = s2.length();

        String large = (l1>=l2)?s1:s2;
        String small = (l1<l2)?s1:s2;

        if(large.equals(s1))
            s1IsLarge = true ;

        for(int i=0;i<small.length(); i++){
            int cl = large.charAt(i);
            int cs = small.charAt(i);
            if(cl>cs){
                return s1IsLarge ;
            }
           else if(cl<cs)
                return false;
        }

        return false ;
    }
}
