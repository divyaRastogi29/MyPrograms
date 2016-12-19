package Programs;

import java.util.HashMap;

/**
 * Created by divya on 15/12/16.
 */
public class SmallestWindow {

    public String getSmallestWindow(String sub_str, String str){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<sub_str.length();i++){
            char c = sub_str.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

    }
}
