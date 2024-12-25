class Solution {
    public void transpose(int[][] matrix) {
       int n = matrix.length;
       transpose(matrix);
        
    }
    public void transpose(int[][] mat){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(mat,i,j);
            }
        }
    }
    public void swap(int mat[][],int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
public class transpose{
    
}