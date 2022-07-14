package Matrices_Lab;

import java.util.Scanner;

public class CompareMartices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int matrix [][] = new int[row][col];

        for (int r = 0; r < row; r++) {
            String[] numbers = scan.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrix[r][c] = Integer.parseInt(numbers[c]);
            }
            System.out.println();
        }
        String[] secondMatrixInput = scan.nextLine().split(" ");
        int rowSecondMatrix = Integer.parseInt(secondMatrixInput[0]);
        int colSecondMatrix = Integer.parseInt(secondMatrixInput[1]);
        int matrixSecond [][] = new int[rowSecondMatrix][colSecondMatrix];

        for (int r2 = 0; r2 < rowSecondMatrix; r2++) {
            String[] numberSecondMatrix = scan.nextLine().split(" ");
            for (int c2 = 0; c2 < colSecondMatrix; c2++) {
                matrixSecond[r2][c2] = Integer.parseInt(numberSecondMatrix[c2]);
            }
            System.out.println();
        }

        if(row == rowSecondMatrix && col == colSecondMatrix ){
           if(isEqual(matrix,matrixSecond,row,col)){
               System.out.println("equal");
           }else{
               System.out.println("not equal");
           }
        }else{
            System.out.println("not equal");
        }
    }

    private static boolean isEqual(int[][] matrix, int[][] matrixSecond, int row, int col) {
        for (int r = 0; r <  row; r++) {
            for (int c = 0; c < col; c++) {
                int num1 = matrix[r][c];
                int num2 = matrixSecond[r][c];
                if (num1 != num2) {
                    return false;
                }
            }
        }
        return true;

    }
}
