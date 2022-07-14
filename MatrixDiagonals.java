package Matrices_Exercises;

import java.util.Scanner;

public class MatrixDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        int diagonal = 0;
        int secondaryDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            String [] nums = scan.nextLine().split(" ");
            diagonal += Integer.parseInt(nums[row]);
            for (int col = 0; col < matrix.length; col++) {
                int currentNum = Integer.parseInt(nums[col]);
                matrix[row][col]= currentNum;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if(col == matrix.length - row - 1){
                    int currentNum = matrix[row][col];
                    secondaryDiagonal += currentNum;
                }
            }
        }
        System.out.println(Math.abs(diagonal - secondaryDiagonal));
    }
}
