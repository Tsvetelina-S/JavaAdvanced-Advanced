package Matrices_Lab;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input [] = scan.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int matrix [][] = new int[row][col];
        for (int r = 0; r < row; r++) {
            String numbers[] = scan.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrix[r][c]=Integer.parseInt(numbers[c]);
            }
            System.out.println();
        }
        int numberToBeFound = Integer.parseInt(scan.nextLine());
        boolean isFount = false;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(numberToBeFound == matrix[r][c]){
                    System.out.printf("%d %d%n",r,c);
                    isFount = true;
                }
            }
        }
        if(!isFount){
            System.out.println("not found");
        }
    }
}
