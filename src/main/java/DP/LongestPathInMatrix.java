package DP;

/**
 * Created by divya on 13/4/17.
 */
public class LongestPathInMatrix {

    public void longestPath(int[][] matrix, int rows, int columns){

        int result = 1;
        int[][] dp = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                dp[i][j]=-1;
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                if(dp[i][j]!=-1)
                    dp[i][j] = longestPathUtil(matrix, i, j, rows, columns, dp);
                result = Math.max(result, dp[i][j]);
            }
        }


    }

    public int longestPathUtil(int[][] matrix, int i, int j, int rows, int columns, int[][] dp){
        if((i<0)||(i>=rows)||(j<0)||(j>=columns))
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int max = 1;
        for(int m=i-1;m<=i+1;m++){
            for(int n=j-1;n<=j+1;j++){
                if(!(m==i&&n==j)){
                    if(matrix[m][n]==1+matrix[i][j])
                        max = Math.max(max,longestPathUtil(matrix,m, n, rows,columns,dp));
                }

            }
        }
        dp[i][j] = 1+max;
        return dp[i][j];
    }
}
