import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by divya on 26/11/16.
 */
public class ArrangeHigh {
    public static void main(String[] args)throws Exception{
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr, new compareSort());
        String result ="";
        for(int i=0;i<N;i++){
            result=arr[i]+result;
        }
        System.out.println(result);
    }


    static class compareSort implements Comparator<Integer>{


        public int compare(Integer n1, Integer n2) {
            n1 = n1.reverse(n1);
            n2 = n2.reverse(n2);
            while((n1!=0)&&(n2!=0)){
                int r1 = n1%10;
                int r2 = n2%10;
                if(r1>r2)
                    return 1;
                else if(r1<r2)
                    return -1;
                n1=n1/10;
                n2=n2/10;
            }

            if(n1!=0)
                return 1;
            if(n2!=0)
                return -1;
            return 0;
        }
    }

}
