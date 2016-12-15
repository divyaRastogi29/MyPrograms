package DP;

/**
 * Created by divya on 12/12/16.
 */
public class CuttingRod {

    public static void main(String[] args){
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                cutRod(arr, size));
        System.out.println("Maximum Obtainable Value is "+
                cutRodDp(arr, size));
    }


    public static int cutRod(int[] price, int n){

        if(n==0)
            return 0;
        int max_price = Integer.MIN_VALUE ;

        for(int i=0;i<n;i++){
            max_price = Math.max(max_price, price[i]+cutRod(price, n-i-1));
        }
        return max_price ;
    }

    public static int cutRodDp(int[] price, int n){
        int[] table = new int[n+1];
        table[0]=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                table[i]= Math.max(table[i],price[j]+cutRodDp(price,i-j-1));
            }
        }
        return table[n];
    }
}
