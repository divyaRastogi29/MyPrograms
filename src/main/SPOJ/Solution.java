import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by divya on 26/10/16.
 */
public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");
        for(String word : magazineWords){
            if(magazineMap.keySet().contains(word))
                magazineMap.put(word, magazineMap.get(word)+1) ;
            else
                magazineMap.put(word,1);
        }
        for(String word : noteWords){
            if(noteMap.keySet().contains(word))
                noteMap.put(word, noteMap.get(word)+1) ;
            else
                noteMap.put(word,1);
        }
    }

    public boolean solve() {
        for(Map.Entry<String,Integer> entry : noteMap.entrySet()){
            if(!((magazineMap.containsKey(entry.getKey()))&&(magazineMap.get(entry.getKey())>=entry.getValue())))
                return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}