import java.util.ArrayDeque;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String[] n = scan.nextLine().split(", ");
        String[] n2 = scan.nextLine().split(", ");

        ArrayDeque<Integer> daffodils = new ArrayDeque<>(); // stack
        ArrayDeque<Integer> tulips = new ArrayDeque<>(); //queue

        for (String t : n) {
            daffodils.push(Integer.parseInt(t));
        }

        for (String t2 : n2) {
            tulips.offer(Integer.parseInt(t2));
        }
        int bouquetCount = 0;
        int left = 0;


        while(!daffodils.isEmpty() && !tulips.isEmpty()) {
            int dafPeek = daffodils.peek();
            int tulPeek = tulips.peek();
            int mix = dafPeek + tulPeek;
            if (mix == 15) {
                bouquetCount++;
                daffodils.pop();
                tulips.poll();
            } else if (mix > 15) {
                tulPeek -= 2;
                tulips.poll();
                tulips.push(tulPeek);
            } else {
                left += mix;
                daffodils.pop();
                tulips.poll();
            }
        }
        int bouquetsLft = left/15;
        bouquetCount += bouquetsLft;
        if(bouquetCount >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!%n",bouquetCount + bouquetsLft);
        }else{
            System.out.printf("You failed... You need more %d bouquets.%n",5 - bouquetCount);

        }
    }
}



