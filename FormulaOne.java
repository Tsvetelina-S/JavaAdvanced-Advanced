package ExamPrep3;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentPlayerRow = 0;
        int currentPlayersCol = 0;
        int n = Integer.parseInt(scan.nextLine());
        String [][] matrix = new String[n][n];
        int countOfCommands = Integer.parseInt(scan.nextLine());
        int sizeOfInput = 0;


        for (int row = 0; row < n; row++) {
            String[] input = scan.nextLine().split("");
            sizeOfInput = input.length;
            for (int col = 0; col < sizeOfInput; col++) {
                matrix[row][col] = input[col];
                if (matrix[row][col].equals("P")) {
                    currentPlayerRow = row;
                    currentPlayersCol = col;
                    matrix[row][col] = ".";
                }
            }
        }
            boolean isFinish = false;
            while (countOfCommands > 0) {
                String command = scan.nextLine();
                int oldPlayerRow = currentPlayerRow;
                int OldPlayerCol = currentPlayersCol;
                switch (command) {
                    case "up":
                            currentPlayerRow--;
                        if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                            currentPlayerRow = n - 1;
                        }
                        if (matrix[currentPlayerRow][currentPlayersCol].equals("F")) {
                            matrix[currentPlayerRow][currentPlayersCol] = "P";
                            isFinish = true;
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("B")) {
                            currentPlayerRow--;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayerRow = n - 1;
                            }
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("T")) {
                            currentPlayerRow++;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = 0;
                            }
                        }
                        break;
                    case "down":
                        currentPlayerRow++;

                        if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                            currentPlayerRow = 0;
                        }
                        if (matrix[currentPlayerRow][currentPlayersCol].equals("F")) {
                            matrix[currentPlayerRow][currentPlayersCol] = "P";
                            isFinish = true;
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("B")) {
                            currentPlayerRow++;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayerRow = 0;
                            }
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("T")) {
                            currentPlayerRow--;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = n - 1;
                            }
                        }
                        break;
                    case "left":
                        currentPlayersCol--;
                        if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                            currentPlayersCol = sizeOfInput - 1;
                        }
                        if (matrix[currentPlayerRow][currentPlayersCol].equals("F")) {
                            matrix[currentPlayerRow][currentPlayersCol] = "P";
                            isFinish = true;
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("B")) {
                            currentPlayersCol--;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = sizeOfInput - 1;
                            }
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("T")) {
                            currentPlayersCol++;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = 0;
                            }
                        }
                        break;
                    case "right":
                        currentPlayersCol++;
                        if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                            currentPlayersCol = 0;
                        }
                        if (matrix[currentPlayerRow][currentPlayersCol].equals("F")) {
                            matrix[currentPlayerRow][currentPlayersCol] = "P";
                            isFinish = true;
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("B")) {
                            currentPlayersCol++;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = 0;
                            }
                        } else if (matrix[currentPlayerRow][currentPlayersCol].equals("T")) {
                            currentPlayersCol--;
                            if (isThePlayerOut(n, sizeOfInput, currentPlayerRow, currentPlayersCol)) {
                                currentPlayersCol = sizeOfInput - 1;
                            }
                        }
                        break;
                }

                if (!isFinish) {
                    countOfCommands--;
                } else {
                    break;
                }
            }
            if(!isFinish){
                matrix[currentPlayerRow][currentPlayersCol] = "P";
            }

                if(isFinish){
                    System.out.println("Well done, the player won first place!");
                }else{
                    System.out.println("Oh no, the player got lost on the track!");
                }
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < sizeOfInput; c++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
    }

    private static boolean isThePlayerOut(int n, int sizeOfInput, int currentPlayerRow, int currentPlayersCol) {
        if (currentPlayerRow > n - 1 || currentPlayerRow < 0 || currentPlayersCol > sizeOfInput - 1 || currentPlayersCol < 0) {
            return true;
        }
        return false;
    }

}
