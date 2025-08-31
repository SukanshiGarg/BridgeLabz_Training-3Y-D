import java.util.Random;

public class MatrixManipulation {
    public static void main(String[] args) {
        int size = 3;
        double[][] matrix = createRandomMatrix(size, size);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse2x2(matrix));
            } else {
                System.out.println("Matrix is singular, inverse does not exist.");
            }
        } else if (size == 3) {
            double det = determinant3x3(matrix);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse3x3(matrix));
            } else {
                System.out.println("Matrix is singular, inverse does not exist.");
            }
        }
    }

    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(10); // Random 0-9
            }
        }
        return mat;
    }

    public static double[][] transposeMatrix(double[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }

    public static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static double determinant3x3(double[][] mat) {
        return mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])
             - mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])
             + mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
    }

    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        double[][] inv = new double[3][3];
        inv[0][0] = (mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])/det;
        inv[0][1]
