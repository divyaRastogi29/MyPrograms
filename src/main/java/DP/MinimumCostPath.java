package DP;

/**
 * Created by divya on 12/12/16.
 */
public class MinimumCostPath {

    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " +
                minimumCostDp(cost,2,2));
    }

    public static int minimumCost(int[][] cost, int m, int n){
        if(m<0||n<0)
            return Integer.MAX_VALUE;
        if(m==0||n==0)
            return cost[m][n];
        return cost[m][n]+min(minimumCost(cost,m-1,n-1),minimumCost(cost,m-1,n),minimumCost(cost,m,n-1));
    }

    public static int min(int a, int b, int c){
        int min=Integer.MAX_VALUE;
        if(a<min)
            min=a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        return min;
    }

    public static int minimumCostDp(int[][] cost, int m, int n){
        int[][] table = new int[m+1][n+1];
        table[0][0] = 0;
        for(int i=1;i<=m;i++)
            table[i][0]=table[i-1][0]+cost[i][0];
        for(int j=1;j<=n;j++)
            table[0][j]=table[0][j-1]+cost[0][j];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==0||j==0)
                    table[i][j] = cost[i][j];
                 int min = min(table[i-1][j-1],table[i-1][j],table[i][j-1]);
                table[i][j]=cost[i][j]+min;
            }
        }
        return table[m][n];
    }
}
