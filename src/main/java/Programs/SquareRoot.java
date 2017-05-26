package Programs;

/**
 * Created by divya on 13/4/17.
 */
public class SquareRoot {

    public int floorSqrt(int x){
        if((x==0)||(x==1))
            return x;
        int start = 1, end = x, mid, ans = 0;


        while (start<=end){
            mid = (start+end)/2 ;

            if(mid*mid==x)
                return mid;
            if(mid*mid>x)
                end = mid-1;
            if(mid*mid<x) {
                start = mid + 1;
                ans = mid ;
            }
        }
        return ans ;
    }
}
