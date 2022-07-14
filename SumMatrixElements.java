package Matrices_Lab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input [] = scan.nextLine().split(", ");
        int sum = 0;
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int matrix [][] = new int[row][col];
        for (int r = 0; r < row; r++) {
            String elements [] = scan.nextLine().split(", ");
            for (int c = 0; c < col; c++) {
                int element = Integer.parseInt(elements[c]);
                sum += element;
                matrix[r][c]= element;
            }
            System.out.println();
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
