import java.util.Arrays;
class DiagonalMatrix {   
    static void printMatrixDiagonal(int mat[][]) 
    {
		int i,j,k;
		int m = mat.length;
		int n = mat[0].length;
		for( k=0; k<= m-1; k++) {
			i = k;
			j = 0;       
			while (i>=0) {
				System.out.print(mat[i][j]);
				i = i-1;
				j = j+1;
			}
		}
		
		for( k=1; k<=n-1; k++) {
			i = m-1;
			j = k;                               
			while(j<= n-1) {
				System.out.print(mat[i][j]);
				i = i-1;
				j = j+1;
			}
		}
    }
   
  
    public static void main(String[] args) 
    { 
        int mat[][] = { { 1, 2, 3 }, 
                        { 4, 5, 6 }, 
                        { 7, 8, 9 } }; 
  
        printMatrixDiagonal(mat); 
    } 
}                                             
