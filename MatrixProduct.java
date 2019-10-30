public class MatrixProduct {
	
    public static Double[][] multiplyMatrix(Double[][] X, Double[][] Y) {
        int xRows = X.length;
        int xColumns = X[0].length;
        int yRows = Y.length;
        int yColumns = Y[0].length;     
        Double[][] Z = new Double[xRows][yColumns];
        if (xColumns != yRows) {
             System.out.print("X:Rows: " + xColumns + " did not match Y:Columns " + yRows + ".");
        } else {
        for (int i = 0; i < xRows; i++) {
            for (int j = 0; j < yColumns; j++) {
                Z[i][j] = 0.0;
            }
        }
        for (int i = 0; i < xRows; i++) { 
            for (int j = 0; j < yColumns; j++) {
                for (int k = 0; k < yColumns; k++) { 
                    Z[i][j] += X[i][k] * Y[k][j];
                }
            }
        }
        }
        return Z;
    }
    
    public static void main(String[] args) {
    	Double[][] X = { { 1.0, 3.0 }, { 2.0, 4.0 } };
    	Double[][] Y = { { 5.0, 8.0 }, { 6.0, 7.0 } };
        Double[][] result = multiplyMatrix(X,Y);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
