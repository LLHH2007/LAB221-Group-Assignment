/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0074;

import java.io.IOException;

/**
 *
 * @author LONG
 */
public class Driver {
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
    
    public static void main(String[] args) throws IOException {
        int[][] matrix1 = inputMatrix(1);
        int[][] matrix2 = inputMatrix(2);
        int choice;
        Matrix m = new Matrix(matrix1, matrix2);
        while (true) {
            choice = Management.Menu();
            switch (choice) {
                case 1:
                    m.additionMatrix();
                    break;
                case 2:
                    m.subtractionMatrix();
                    break;
                case 3:
                    m.multiplicationMatrix();
                    break;
                case 4:
                    return;
            }
        }
    }
}
