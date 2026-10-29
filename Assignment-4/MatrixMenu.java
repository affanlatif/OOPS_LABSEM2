import java.util.Scanner;

public class MatrixMenu {
    static Scanner sc = new Scanner(System.in);

    static int[][] createMatrix() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid matrix dimensions.");
            return null;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    static void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix not created.");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Please create both matrices first.");
            return;
        }

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Addition not possible. Both matrices must have the same size.");
            return;
        }

        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result of Addition:");
        displayMatrix(result);
    }

    static void subtractMatrix(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Please create both matrices first.");
            return;
        }

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Subtraction not possible. Both matrices must have the same size.");
            return;
        }

        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Result of Subtraction:");
        displayMatrix(result);
    }

    static void multiplyMatrix(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Please create both matrices first.");
            return;
        }

        if (a[0].length != b.length) {
            System.out.println("Multiplication not possible. Columns of first matrix must equal rows of second matrix.");
            return;
        }

        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result of Multiplication:");
        displayMatrix(result);
    }

    public static void main(String args[]) {
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        int choice;

        do {
            System.out.println("\nMATRIX OPERATIONS");
            System.out.println("1. Create and Display Matrix");
            System.out.println("2. Matrix Addition");
            System.out.println("3. Matrix Subtraction");
            System.out.println("4. Matrix Multiplication");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter First Matrix:");
                    matrix1 = createMatrix();
                    if (matrix1 != null) {
                        System.out.println("First Matrix:");
                        displayMatrix(matrix1);
                    }

                    System.out.println("\nEnter Second Matrix:");
                    matrix2 = createMatrix();
                    if (matrix2 != null) {
                        System.out.println("Second Matrix:");
                        displayMatrix(matrix2);
                    }
                    break;

                case 2:
                    addMatrix(matrix1, matrix2);
                    break;

                case 3:
                    subtractMatrix(matrix1, matrix2);
                    break;

                case 4:
                    multiplyMatrix(matrix1, matrix2);
                    break;

                case 5:
                    System.out.println("Program terminated!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}