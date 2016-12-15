package DP;

/**
 * Created by divya on 14/12/16.
 */
public class NumbersWithSum {


String minStr = "";
    String maxStr = "";
    public int minimumSum(int sum, int n){

        if((sum<=0)&&(n>0))
            return -1;
        if((n<=0)&&(sum>0))
            return -1;
        int curr_min = Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<=9;i++){
            int sub_sum = i+minimumSum(sum-i,n-1);
            if((sub_sum>=0)&&(sub_sum<curr_min)) {
                curr_min = sub_sum;
                flag=true;
            }
        }
        if(flag)
            return curr_min;
        else
            return -1;
    }

    public int maximumSum(int sum, int n){
        if((sum<=0)&&(n>0))
            return -1;
        if((n<=0)&&(sum>0))
            return -1;
        int curr_max=Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=0;i<=9;i++){
            int sub_sum = i+maximumSum(sum-i,n-1);
            if((sub_sum>=0)&&(sub_sum>curr_max)){
                curr_max = sub_sum;
                flag=true;
            }
        }

        if(flag)
            return curr_max;
        else
            return -1;
    }
}
