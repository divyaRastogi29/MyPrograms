package DP;

/**
 * Created by divya on 12/12/16.
 */
public class LongestCommonSubsequence {

    public static void main(String[] args){
        String x = "swdbdebc";
        String y = "dbebeej";
        System.out.println(lcs(x,y,x.length(),y.length()));
        System.out.println(longestCommonSubsequence(x,y));
    }

    public static  int lcs(String x, String y, int i, int j){
        if((i==0)||(j==0))
            return 0;
        if(x.charAt(i-1)==y.charAt(j-1)) {
            return 1 + lcs(x, y, i - 1, j - 1);
        }
        else return Math.max(lcs(x,y,i-1,j),lcs(x,y,i,j-1));
    }

    public static int longestCommonSubsequence(String x, String y){
     int[][] table = new int[x.length()+1][y.length()+1];

        for(int i=0;i<=x.length();i++){
            for(int j=0;j<=y.length();j++){
                if(i==0||j==0)
                    table[i][j]=0;
               else if(x.charAt(i-1)==y.charAt(j-1)){
                    table[i][j] =1+table[i-1][j-1];
                }
                else
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
            }
        }

       return table[x.length()][y.length()];
    }
}
