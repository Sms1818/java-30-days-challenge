public class SetMatrixZeroes {
    // Brute Force Approach
    // Time Complexity: O(m*n*(m+n)), m*n for traversing the matrix and m+n for setting rows and columns to zero
    // Space Complexity: O(1)
    public static void setZeroesBrute(int[][] matrix){
        // First pass to find the rows and columns that need to be set to zero
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    // Mark Row
                    for(int k=0;k<m;k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k]=-1; // Marking non-zero elements in the row to -1
                        }
                    }
                    // Mark Column
                    for(int k=0;k<n;k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j]=-1; // Marking non-zero elements in the column to -1
                        }
                    }
                }
            }
        }

        // Second pass to set the marked elements to zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0; // Setting marked elements to zero
                }
            }
        }

    }

    // Optimized Approach : We can use the first row and first column of the matrix to store the information about which rows and columns need to be set to zero. This way, we can achieve O(1) space complexity.
    // Time Complexity: O(m*n)
    // Space Complexity: O(1)
    public static void setZeroesOptimized(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRowZero = true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0; // Marking the first element of the row to zero
                    matrix[0][j]=0; // Marking the first element of the column to zero
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0; // Setting the element to zero if the first element of the row or column is zero
                }
            }
        }
        if(firstRowZero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0; // Setting the first row to zero if needed
            }
        }
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0; // Setting the first column to zero if needed
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroesBrute(matrix);
        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrix2 = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroesOptimized(matrix2);
        // Print the modified matrix
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
