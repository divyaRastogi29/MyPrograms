package DP;

/**
 * Created by divya on 12/4/17.
 */

/*
Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.
*/
public class WaysToCoverDistance {

    public int checkDistance(int n){
       if(n<0)
           return 0;
       if(n==0)
           return 1;
      return checkDistance(n-1)+checkDistance(n-2)+checkDistance(n-3);
    }

    public int checkDistanceDP(int n){
        int[] table = new int[n+1];
        table[0]=1;
        table[1]=1;
        table[2]=2;
        for(int i=3;i<=n;i++){
            table[i] = table[i-1]+table[i-2]+table[i-3];
        }
        return table[n];
    }
}
