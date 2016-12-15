package DP;

/**
 * Created by divya on 14/12/16.
 */
public class LongestPalindromicSubsequence {

    public static int lps(String x, int i, int j){

        if(i==j)
            return 1;
        if((i+1==j)&&(x.charAt(i)==x.charAt(j)))
            return 2;
        if(x.charAt(i)==x.charAt(j))
            return 2+lps(x,i+1,j-1);
        return Math.max(lps(x,i+1,j),lps(x,i,j-1));
    }


    public static int lpsDp(String x){
        int[][] table = new int[x.length()][x.length()];
        int l = x.length();
        for(int i=0;i<l;i++)
            table[i][i]=1;
/*if assuming length l=10, c1=2 , so i can move from 0 to 7 bcoz last element index will be 9*/
        for(int c1=2;c1<=l;c1++){
            for(int i=0;i<l-c1+1;i++){
                int j= i+c1-1;
                if((x.charAt(i)==x.charAt(j))&&(i+1==j))
                    table[i][j]=2;
                else if((x.charAt(i)==x.charAt(j)))
                    table[i][j]=2+table[i-1][j-1];
                else
                    table[i][j]= Math.max(table[i+1][j],table[i][j-1]);
            }
        }
        return table[0][x.length()-1];
    }
}
