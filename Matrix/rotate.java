// leetcode 48
//https://leetcode.com/problems/rotate-image/
class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;
       transpose(matrix);
       for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;
        }
       }
        
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
public class rotate{
    
}