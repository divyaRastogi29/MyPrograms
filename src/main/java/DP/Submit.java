/**
 * Created by divya on 29/11/16.
 */
/*
public class Submit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(findLengthDP(arr,n));
    }
    public static int findLengthDP(int[] arr,int n){
        int[] table =  new int[n+1];

        for(int i=0;i<=n;i++)
            table[i]=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if(arr[j]>=arr[j-1])
                    table[j]=Math.max(1+table[j-1],table[j]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(table[i]>max)
                max=table[i];
        }
        return max;
    }
}
*/
