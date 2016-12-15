package Programs; /**
 * Created by divya on 12/6/16.
 */
import java.util.Scanner;

class GFG2 {
    public static void main (String[] args) {
        Scanner ss = new Scanner(System.in);
        int t = ss.nextInt();
        for(int z=1;z<=t;z++){
           String s = ss.next();
            int c = s.length()-1;
            String st="";
            while(c>=0) {
                for(int i=1;i<=c;i++)
                    st=st+".";
                for (int i = 0; i<(s.length()-c); i++)
                    st=st+s.charAt(i);
                System.out.println(st);
                c--;
                st = "";
            }
        }
    }
}
