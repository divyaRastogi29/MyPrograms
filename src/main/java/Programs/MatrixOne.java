package Programs;

import java.util.Scanner;

/**
 * Created by divya on 18/5/16.
 */
public class MatrixOne {
    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a= new int[n][n];
        for(int i=0 ; i<n; i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println("\n");
        }
    }


    public void rotateMatrix(int[][] mat){
        int n = mat.length;
        for(int x= 0; x< (n/2); x++){
            for(int y=x; y<(n-x-1);y++){
                int temp = mat[x][y];
                mat[x][y]=mat[y][n-1-x];
                mat[y][n-1-x] = mat[n-1-x][n-1-y];
                mat[n-1-x][n-1-y]=mat[n-1-y][x];
                mat[n-1-y][x]=temp;
            }
        }
    }
}
