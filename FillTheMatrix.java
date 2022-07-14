package Matrices_Exercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String symbol = input[1];
        int[][] matrix = new int[n][n];

        switch (symbol){
            case "A":
                matrixOfCaseA(matrix);
                break;
            case "B":
                matrixOfCaseB(matrix);
                break;
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixOfCaseB(int[][] matrix) {
        int startingNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startingNumber;
                    startingNumber++;
                }

                }else{
                for (int row = matrix.length -1; row >= 0 ; row--) {
                    matrix[row][col] = startingNumber;
                    startingNumber++;
                }
            }
        }
    }

    private static void matrixOfCaseA(int[][] matrix) {
        int startingNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startingNumber;
                startingNumber++;

            }
        }
    }
}
