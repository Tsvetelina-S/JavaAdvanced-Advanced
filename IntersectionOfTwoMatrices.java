package Matrices_Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());
        String matrixA [][] = new String [row][col];
        String matrixB [][] = new String [row][col];


        for (int r = 0; r < row; r++) {
            String input[] = scan.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrixA[r][c] = input[c];

            }
            System.out.println();
        }
        for (int r = 0; r < row; r++) {
            String input2 [] = scan.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrixB[r][c] = input2[c];

            }
            System.out.println();
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                String elementA = matrixA[r][c];
                String elementB = matrixB[r][c];
                if(elementA.charAt(0) != elementB.charAt(0)){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(elementA + " ");
                }
            }
            System.out.println();
        }
    }
}
