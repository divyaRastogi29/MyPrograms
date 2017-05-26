package Programs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by divya on 20/4/17.
 */

/*An element is leader in an array if it is greater than all elements to its right*/

public class Leaders {

    int maxFromEnd = -1 ;

    public List<Integer>  getLeaders(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length-1]);
        maxFromEnd = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--){

            if(arr[i]>maxFromEnd) {
                leaders.add(arr[i]);
                maxFromEnd = arr[i];
            }

        }
        return leaders ;
    }
}
