package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by divya on 24/4/16.
 */
public class Lost {
    public static void main(String[] args)throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("\nOriginal array : ");
            String[] original = p.readLine().split(" ");
            int[] orig = new int[original.length];
            System.out.println("\nDuplicate array : ");
            String[] duplicate = p.readLine().split(" ");
            int[] dup = new int[duplicate.length];
            for(int i=0 ; i<orig.length; i++)
                orig[i] = Integer.parseInt(original[i]);
            for (int i=0; i<dup.length ; i++)
                dup[i]=Integer.parseInt(duplicate[i]);
          int result = findMissing(orig, dup);
            System.out.println("\nMissing element : "+result);
        }
    }

    public static int findMissing(int[] original, int[] duplicate){
         int missingElement = 0;
         int l=0,h=original.length-1,m;
        while(l<h){
           m= (l+h)/2;
            if(original[m]==duplicate[m])
                l=m;
            else
                h=m;
            if(l==(h-1)){
                if(original[h]==duplicate[l])
                    return original[l];
                else if(original[l]==duplicate[h])
                    return original[h];
                else if(original[l]==duplicate[l])
                    return original[h];
                else
                    return original[l];

            }
        }
         return missingElement;
    }
}
