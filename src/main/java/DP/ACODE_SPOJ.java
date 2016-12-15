package DP;

/**
 * Created by divya on 28/11/16.
 */
public class ACODE_SPOJ {

    public static void main(String[] args) {
        String n = "3333333333";

        System.out.println(findWaysDp(n));
    }

    private static int findWays(String n) {
        if(n.equals(""))
            return 1;
        if(n.length()==1)
            return 1;
        if(Integer.parseInt(n.substring(0,2))<=26)
            return findWays(n.substring(1))+findWays(n.substring(2));
        return findWays(n.substring(1));
    }

    private static int findWaysDp(String n){
        int[] table = new int[n.length()+1];
        table[0]=1;
        table[1]=1;
        for(int i=2;i<=n.length();i++){
          if(Integer.parseInt(n.substring(i-2,i))<=26)
              table[i]= table[i-2];
            table[i]=table[i]+table[i-1];
        }
        return table[n.length()];
    }
}
