package Programs;

/**
 * Created by divya on 15/12/16.
 */
public class CountWays {

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }

    public static int countWays(int n){

        if(n==0||n==1||n==2)
            return n;
      return countWays(n-1)+countWays(n-2);

    }
}
