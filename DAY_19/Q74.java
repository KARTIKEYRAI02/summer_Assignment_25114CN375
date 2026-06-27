public class Q74 {
public static void main(String[] args) {
        int[][] matrix1 = {
            {5, 8, 9},
            {6, 7, 3},
            {4, 5, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {3, 2, 1},
            {2, 1, 4}
        };

        int rows = matrix1.length;
        int columns = matrix1.length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Result of Matrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}