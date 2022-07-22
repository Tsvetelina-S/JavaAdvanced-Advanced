package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        List<Car> carsCollection = new ArrayList<>();

        for (int i = 1; i <= N ; i++) {
           String [] input = scan.nextLine().split(" ");
            String brand = input[0];
           if(input.length == 1){
               Car car = new Car(brand);
               carsCollection.add(car);
           }
           if(input.length > 1) {
               String model = input[1];
               int horsePower = Integer.parseInt(input[2]);
               Car car2 = new Car (brand,model,horsePower);
               carsCollection.add(car2);
           }

        }
        carsCollection.forEach(car -> System.out.println(car.carInfo()));
    }
}
