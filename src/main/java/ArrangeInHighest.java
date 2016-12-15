import java.util.Scanner;

/**
 * Created by divya on 26/11/16.
 */
public class ArrangeInHighest {

    public static void main(String[] args)throws Exception{
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[] arr = new String[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = s.next();
            if(arr[i].length()>max)
                max=arr[i].length();
        }

        for(int i=0,j=N-1;(i<max)&&(j>0);i++){
            sortArray(arr, i,j);
            while((j>0)&&(arr[j].length()>i)&&(arr[j-1].length()>i)){
               int charj = Integer.parseInt(arr[j].charAt(i)+"");
                int charj1 = Integer.parseInt(arr[j-1].charAt(i)+"");
                if(charj>charj1)
                    j--;
                else
                    break;
            }
        }

        String result ="";
        for(int i=0;i<N;i++){
            result=arr[i]+result;
        }
        System.out.println("\n"+result);
    }

    private static void sortArray(String[] arr, int i,int limit) {
        for(int j=limit;j>=0;j--){
            for(int k=0;k<j;k++){
                if((arr[k].length()>i)&&(arr[k+1].length()>i)){
                    int chark = Integer.parseInt(arr[k].charAt(i)+"");
                    int chark1 = Integer.parseInt(arr[k+1].charAt(i)+"");
                    if(chark>chark1){
                        String temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1]=temp;
                    }
                }
                else if(arr[k].length()>i){
                    String temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
    }
}
