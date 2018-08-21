package Amazon;

/**
 * Created by b0200901 on 7/12/2018
 */
public class PalindromicSubstring {

   static int maxLength=0;
   static String maxString="";

    public static void main(String[] args) {
        getLongestPalindromicString("abcdefdfedcbada");
    }
    public static void getLongestPalindromicString(String s){

      boolean a = isPalindromeUtil(s, 0, s.length()-1);
        System.out.println(maxString);
    }


    public static boolean isPalindromeUtil(String s, int i, int j){
        if(i==j)
            return true;
        if(i>(s.length()-1))
            return false;
        if(j<0)
            return false;

        boolean a = isPalindromeUtil(s, i+1, j);
        boolean b = isPalindromeUtil(s, i, j-1);
        boolean c = isPalindromeUtil(s, i+1, j-1);

        if((s.charAt(i)==s.charAt(j))&&(c)) {
            if((j-i+1)>maxLength) {
                maxLength = j - i + 1;
                maxString = s.substring(i,j+1);
            }
            return true;
        }
        return false;
    }


    public static void isPalinDP(String s){
        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i=0; i<=s.length(); i++)
            dp[i][i] = true;



    }

}

