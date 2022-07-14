package Matrices_Exercises;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split("\\s+");
        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[1]);
        String [][] matrix = new String[row][col];

        for (int r = 0; r < row; r++) {
            String element [] = scan.nextLine().split("\\s+");
            for (int c = 0; c < col; c++) {
                matrix[r][c]= element[c];
            }
            System.out.println();
        }
        String input = scan.nextLine();
        while(!input.equals("END")){

        if(isValid(input,row,col)){

            String[] command = input.split("\\s+");

            int row1 = Integer.parseInt(command[1]);
            int col1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[3]);
            int col2 = Integer.parseInt(command[4]);

            String firstElement = matrix[row1][col1];
            String secondElement = matrix[row2][col2];

            matrix[row1][col1] = secondElement;
            matrix[row2][col2] = firstElement;

            printMatrix(matrix,row,col);

        }else{

            System.out.println("Invalid input!");
        }
            input = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix,int rowSize,int colSize) {
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValid(String command,int rows, int cols) {
        String[] input = command.split("\\s+");

        if(!input[0].equals("swap")) {
            return false;
        }
        if(input.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(input[1]);
        int col1 = Integer.parseInt(input[2]);
        int row2 = Integer.parseInt(input[3]);
        int col2 = Integer.parseInt(input[4]);


        return row1 >= 0 && row1 < rows && row2 >= 0 && row2 < rows && col1 >= 0 && col1 < cols && col2 >= 0 && col2 < cols;

    }
}
