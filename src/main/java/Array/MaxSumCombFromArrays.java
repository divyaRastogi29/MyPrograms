package Array;

import java.util.*;

/**
 * Created by b0200901 on 6/29/2018
 */
public class MaxSumCombFromArrays {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{4,2,5,1};
        Integer[] b = new Integer[]{8,0,3,5};

        System.out.println(maxSumCombArrays(a, b,2 ));
    }

    public static PriorityQueue<Integer> maxSumCombArrays(Integer[] a, Integer[] b, int k){

        int count = 0;

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());
        Map<Integer, Integer[]> map = new HashMap<>();
        int i=0, j=0;

        while (count<=k){
            int sum = a[i]+b[j];
            queue.add(sum);
            Integer[] list = new Integer[2]; list[0]=i; list[1]=j;
            map.put(sum, list);

            if((i<=(a.length-2))&&(j<=(b.length-2))&&((a[i+1]+b[j])>(a[i]+b[j+1]))){
                i++;
            }
            else {
                if(j<=b.length-2)
                    j++;
            }
            count++;
        }
        return queue;
    }




}
