package Amazon;

/**
 * Created by divya on 20/3/17.
 */
public class LargestRegionInBooleanMatrix {

    public int largestRegion(int[][] matrix){
        int rowsLength = matrix.length;
        int colsLength = matrix[0].length;
        boolean[][] visited = new boolean[rowsLength][colsLength];
        int result = Integer.MIN_VALUE;
        for(int i=0; i<rowsLength; i++){
            for(int j=0; j<colsLength; j++){
                if((matrix[i][j]==1)||(!visited[i][j])){
                    Integer count = 1;
                    DFS(matrix, visited, count, i, j);
                    result = Math.max(result,count);
                }
            }
        }
        return result ;
    }

    public void DFS(int[][] matrix, boolean[][] visited, Integer count, int row, int column){
        int[] rowNbr = {-1,-1,-1,0,0,1,1,1};
        int[] colNbr = {-1,0,1,-1,1,-1,0,1};
        visited[row][column] = true ;
        for(int k=0 ;k<8 ;k++) {
            if (isSafe(matrix, row, column, visited)) {
                count++;
                DFS(matrix, visited, count, row+rowNbr[k], column+colNbr[k]);
            }
        }
    }

    public boolean isSafe(int[][] matrix, int row, int column, boolean[][] visited){
        int rowsLength = matrix.length;
        int colsLength = matrix[0].length;
        return ((row>0) && (row<rowsLength) && (column>0) &&(column<colsLength) && (!visited[row][column]) && (matrix[row][column]==1));
    }
}
