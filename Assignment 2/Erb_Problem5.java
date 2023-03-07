//This program will flip the rows and the columns of a 2D Array

public class Erb_Problem5 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Print the original array
        System.out.println("Original array:");
        print2DArray(A);

        // Transpose the array
        int m = A.length;
        int n = A[0].length;
        int[][] B = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[j][i] = A[i][j];
            }
        }

        // Print the transposed array
        System.out.println("Transposed array:");
        print2DArray(B);
    }

    public static void print2DArray(int[][] A) {
        for (int[] row : A) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}