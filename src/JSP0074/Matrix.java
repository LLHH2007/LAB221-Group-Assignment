/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0074;

/**
 *
 * @author LONG
 */
public class Matrix {
    int[][] matrix1;
    int[][] matrix2;

    public Matrix() {
    }

    public Matrix(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    private void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static int[][] inputMatrix(int n) {
        System.out.print("Enter Row Matrix: ");
        int row = Validation.checkInputInt();
        System.out.print("Enter Colum Matrix: ");
        int col = Validation.checkInputInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + i + "]" + "[" + j + "]:");
                matrix[i][j] = Validation.checkInputInt();
            }
        }
        return matrix;
    }
    
    public void additionMatrix() {
        if((matrix1.length!=matrix2.length)||(matrix1[0].length!=matrix2[0].length)){
            System.out.println("Can't add!");
            return;
        }
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (matrix1[i][j] + matrix1[i][j]) + "]");
            }
            System.out.println();
        }
    }

    public void subtractionMatrix() {
        if((matrix1.length!=matrix2.length)||(matrix1[0].length!=matrix2[0].length)){
            System.out.println("Can't subtract!");
            return;
        }
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
            }
            System.out.println();
        }
    }

    public void multiplicationMatrix() {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if (col1 != row2) {
            System.err.println("Can't multiple");
            return;
        }
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        int[][] matrixResult = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrixResult[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        displayMatrix(matrixResult);
    }
}
