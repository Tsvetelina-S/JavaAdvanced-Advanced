import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pythonCurrentRow = 0;
        int pythonCurrentCol = 0;
        int countF = 0;
        int eatenFood = 0;
        int pythonLength = 0;
        boolean isKilled = false;
        boolean isEaten = false;

        int n = Integer.parseInt(scan.nextLine());
        String[] commandToMoveThePython = scan.nextLine().split(", ");
        String[][] matrix = new String[n][n];

        for (int row = 0; row < n; row++) { // 3
            String[] input = scan.nextLine().split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = input[col];

                if (input[col].equals("s")) {
                    pythonCurrentRow = row;
                    pythonCurrentCol = col;
                }
                if (input[col].equals("f")) {
                    countF++;
                }
            }
        }
        for (int i = 0; i < commandToMoveThePython.length; i++) {
            String command = commandToMoveThePython[i];
            if (command.equals("up")) {
                pythonCurrentRow--;

                if(isPythonOut(n,pythonCurrentRow,pythonCurrentCol)){
                    pythonCurrentRow = n-1;
                }
                if(matrix[pythonCurrentRow][pythonCurrentCol].equals("e")) {
                        System.out.println("You lose! Killed by an enemy!");
                        isKilled = true;
                        break;
                    }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("f")) {
                    eatenFood++;
                    if(eatenFood == countF){
                        System.out.printf("You win! Final python length is %d", pythonLength);
                        isEaten = true;
                        break;
                    }
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("*")){
                    pythonLength++;
                }
            } else if (command.equals("down")) {
                pythonCurrentRow++;

                if(isPythonOut(n,pythonCurrentRow,pythonCurrentCol)){
                    pythonCurrentRow = 0;
                }
                if(matrix[pythonCurrentRow][pythonCurrentCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    isKilled = true;
                    break;
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("f")) {
                    eatenFood++;
                    if(eatenFood == countF){
                        System.out.printf("You win! Final python length is %d", pythonLength);
                        isEaten = true;
                        break;
                    }
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("*")){
                    pythonLength++;
                }

            } else if (command.equals("left")) {
                pythonCurrentCol--;

                if(isPythonOut(n,pythonCurrentRow,pythonCurrentCol)){
                    pythonCurrentCol = n-1;
                }
                if(matrix[pythonCurrentRow][pythonCurrentCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    isKilled = true;
                    break;
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("f")) {
                    eatenFood++;
                    if(eatenFood == countF){
                        System.out.printf("You win! Final python length is %d", pythonLength);
                        isEaten = true;
                        break;
                    }
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("*")){
                    pythonLength++;
                }

            } else if (command.equals("right")) {
                pythonCurrentCol++;

                if(isPythonOut(n,pythonCurrentRow,pythonCurrentCol)){
                    pythonCurrentCol = 0;
                }
                if(matrix[pythonCurrentRow][pythonCurrentCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    isKilled = true;
                    break;
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("f")) {
                    eatenFood++;
                    if(eatenFood == countF){
                        System.out.printf("You win! Final python length is %d", pythonLength);
                        isEaten = true;
                        break;
                    }
                }else if(matrix[pythonCurrentRow][pythonCurrentCol].equals("*")){
                    pythonLength++;
                }
            }
        }
        if(!isKilled && !isEaten) {
            if (countF > eatenFood) {
                System.out.printf("You lose! There is still %d food to be eaten.%n", countF - eatenFood);
            }
        }
    }
    private static boolean isPythonOut(int n, int currentPlayerRow, int currentPlayersCol) {
        if (currentPlayerRow > n - 1 || currentPlayerRow < 0 || currentPlayersCol > n - 1 || currentPlayersCol < 0) {
            return true;
        }
        return false;
    }
}
//⦁	*– that is a regular asterisk; it does nothing
//⦁	e – represents an enemy.
//⦁	f – this is the food
//⦁	s - the place where the game starts