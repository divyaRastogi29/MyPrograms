package DP;

/**
 * Created by divya on 24/4/17.
 */
public class EditDistance {

    public int editDistance(String s1, String s2, int i , int j){

        if(i<0)
            return j;
        if(j<0)
            return i;

        if(s1.charAt(i)==s2.charAt(j))
            return editDistance(s1, s2, i-1, j-1);
        else{
            int a = editDistance(s1, s2, i-1,j);
            int b = editDistance(s1, s2, i, j-1);
            int c = editDistance(s1, s2, i-1, j-1);
            return 1+ Math.min(a,Math.min(b,c));
        }

    }

    public int editDistanceDp(String s1, String s2){

        int[][] table = new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<s1.length();i++)
            table[i][0] = i;
        for(int j=0 ;j<s2.length();j++)
            table[0][j] = j;

        for(int i=1; i<= s1.length(); i++){
            for(int j=1;j<= s2.length();j++){
                if(s1.charAt(i-1)== s2.charAt(j-1))
                    table[i][j] = table[i-1][j-1];
                else {
                    table[i][j] = 1+ Math.min(table[i-1][j-1], Math.min(table[i-1][j], table[i][j-1]));
                }
            }
        }

        return table[s1.length()][s2.length()];

    }
}
