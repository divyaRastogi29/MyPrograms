package Leet;

import java.util.*;

/**
 * Created by B0200901 on 6/2/2018
 */
public class ThreeSum {

    public static void main(String[] args) {
      /*  int[] result = solution(new int[]{9,1,4,9,0,4,8,9,0,1});
        for (int i: result)
            System.out.println(i);*/
     Integer a = new Integer(5);
     a = new Integer(7);
    }

    public  int solution0(String E, String L) {
        // write your code in Java SE 8
        int totalCost = 0;
        String[] E1 = E.split(":");
        String[] L1 = L.split(":");

        int eh1 = Integer.parseInt(E1[0]);
        int em1 = Integer.parseInt(E1[1]);

        int lh1 = Integer.parseInt(L1[0]);
        int lm1 = Integer.parseInt(L1[1]);

        int totalMins = ((lh1-eh1)*60)+(lm1-em1);

        int totalHours = totalMins/60;
        int truncatedMins = totalMins - (totalHours*60);
        if((totalHours>0) ||(truncatedMins>0))
            totalCost+=2;
        if((totalHours==0)&&(truncatedMins>0)) {
            totalCost += 3;
            return totalCost;
        }
        if(totalHours>=1){
            totalCost +=3;
            totalHours--;
        }
        while (totalHours>0){
            totalCost +=4;
            totalHours--;
        }
        if(truncatedMins>0)
            totalCost += 4;
        return totalCost;
    }

    public  int solution1(int[] A) {
        // write your code in Java SE 8

        int range =7;
        int rangeCost=0;

        int totalCost = 0;

        for(int i: A){
            if((i==29) || (i==30)){
                totalCost+=2;
            }
            else if(i<range){
                rangeCost +=2;
            }
            else {
                rangeCost = Math.min(rangeCost, 7);
                range = range+7;
                totalCost+=rangeCost;
            }
        }
        return Math.min(totalCost, 25);
    }

    public static int[] solution(int[] T) {
        // write your code in Java SE 8

        int[] resultDistance = new int[T.length-1];
        Map<Integer, List<Integer>> map = new HashMap<>();

        int capital=0;

        for(int i=0; i<T.length; i++){
            if(i == T[i])
                capital = i;
            else if(map.containsKey(T[i])){
                List<Integer> list = map.get(T[i]);
                list.add(i);
                map.put(T[i], list);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(T[i], list);
            }
        }
        solutionUtil(capital, map, 0, resultDistance, T.length-1);
        return resultDistance;
    }

    private static void solutionUtil(int capital, Map<Integer, List<Integer>> map, int i, int[] result, int limit) {
        if(i>= limit)
            return;
        List<Integer> list = map.get(capital);
        if(list!=null) {
            result[i] = result[i] + list.size();
            list.forEach(v -> solutionUtil(v, map, i + 1, result, limit));
        }
    }
}
