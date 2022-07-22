package SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        Car car = null;
        Map<String, Double> map = new LinkedHashMap<>();
        double fuelAmount = 0;
        double fuelCostFor1km = 0;
        for (int i = 1; i <= N ; i++) {
            String input [] = scan.nextLine().split("\\s+");
            String model = input[0];
            fuelAmount = Double.parseDouble(input[1]);
            fuelCostFor1km = Double.parseDouble(input[2]);
            car = new Car(model,fuelAmount,fuelCostFor1km,0);

        }
        String command = scan.nextLine();
        while(!command.equals("End")){
            String mainCommand = command.split("\\s+")[0];
            String carModel = command.split("\\s+")[1];
            int amountOfKm = Integer.parseInt(command.split("\\s+")[2]);
           double currentFuel = car.Drive(fuelAmount,fuelCostFor1km,amountOfKm);
               map.put(carModel,currentFuel);
            command= scan.nextLine();
        }
        ///не решена!!!



    }

}
