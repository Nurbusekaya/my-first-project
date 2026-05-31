public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] B = {
                { 7, 8 },
                { 9, 1 },
                { 2, 3 }
        };
        System.out.println("--- Çarpım Sonucu ---");
        int[][] result = multiply(A, B);
        printMatrix(result);
    }
    public static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}