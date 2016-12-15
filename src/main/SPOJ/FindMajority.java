/**
 * Created by divya on 28/8/16.
 */
public class FindMajority {
    public int findMajority(int[] arr){
        int maj_index=0 , count =1;
        for(int i=1; i<arr.length;i++){
            if(arr[i]==arr[maj_index])
                count++;
            else
                count--;
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        
return arr[maj_index];
    }

    public int findHcf(int x, int y){
       while(y!=0){
           int t = y;
           y = x% y;
           x = t ;
       }
     return x;
    }
}
