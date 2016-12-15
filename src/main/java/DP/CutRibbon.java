package DP;

/**
 * Created by divya on 29/11/16.
 */
public class CutRibbon {

    public static void main(String[] args){
        int n=7;
        int[] arr={5,5,2};
        System.out.println(findMaximum(arr,0,n));
    }

    private static int findMaximum(int[] arr, int x,int n) {
        if((n<=0)||(x>=arr.length))
            return 0;
        if(arr[x]<=n){
            return Math.max(findMaximum(arr,x+1,n),1+findMaximum(arr,x,n-arr[x]));
        }
        else
            return findMaximum(arr,x+1,n);
    }
//table[i] denotes maximum pieces that can be formed in length i from those three pieces
    private static int findMaximumDP(int[] arr, int x, int n){
        int[][] table = new int[n+1][arr.length+1];
       for(int i=0;i<=n;i++){
           for(int j=0;j<=arr.length;j++){
               if((i==0)||(j==0))
                   table[i][j]=0;
           }
       }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=arr.length;j++){
                if(arr[j-1]<=i){
                    table[i][j]=Math.max(table[i][j-1],table[i-arr[j-1]][j]+1);
                }
                else
                    table[i][j]=table[i][j-1];
            }
        }
        return table[n][arr.length];
    }
}
