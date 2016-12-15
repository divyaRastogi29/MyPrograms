package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by divya on 22/4/16.
 */
public class ProgramOne {
    public static void main(String[] args)throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int count =0 ;
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();
            System.out.println("\nEnter nos");
            String[] s = p.readLine().split(" ");
            System.out.println("\nEnter sum");
            int sum = Integer.parseInt(p.readLine());
            int[] array = new int[s.length];
            for(int i=0;i<s.length;i++){
                array[i]=Integer.parseInt(s[i]);
                if(map.keySet().contains(array[i])){
                    int value = map.get(array[i]);
                    map.put(array[i], ++value);
                }
                else{
                    map.put(array[i], 1);
                }
            }
            for(int i : array){
               int val = sum - i;
                if(map.containsKey(val)) {
                    count = count+map.get(val);
                    if (val == i)
                        count--;
                }
            }
            System.out.println("\nMap : "+map);
            System.out.println("\ncount is : "+(count/2));
        }//completes while
    }

}
