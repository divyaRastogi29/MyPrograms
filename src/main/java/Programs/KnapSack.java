package Programs;

/**
 * Created by divya on 8/6/16.
 */
public class KnapSack {
    public static void main(String args[])
    {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{1, 2, 3};
        int  W = 5;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }

    public static int knapSack(int W, int[] wt, int[] val, int n){
        int[][] b = new int[n+1][W+1];
        for(int j=0;j<=W;j++)
            b[0][j]=0;
        for(int i=1;i<=n;i++)
            b[i][0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    int b1 = b[i-1][j-wt[i-1]] + val[i-1];
                    int b2 = b[i-1][j];
                    if(b1>b2)
                        b[i][j]=b1;
                    else
                        b[i][j]=b2;
                }
                else{
                    b[i][j]=b[i-1][j];
                }
            }
        }
        return b[n][W];
    }
}


/*
if((wt[j-1]<=j)&&((b[i-1][j-wt[j-1]]+val[i-1])>b[i-1][j]))
        b[i][j]= b[i-1][j-wt[j-1]]+val[i-1];
        else
        b[i][j]=b[i-1][j];*/
