package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double costForKM ;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double costForKM,int distanceTraveled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.costForKM = costForKM;
        this.distanceTraveled = distanceTraveled;
    }

    public double Drive (double fuel,double costForKM,int amountOfkm){
        double waste = costForKM * amountOfkm;
        if (waste <= fuel){
            double currentFuel = fuel - waste;
            this.fuelAmount = fuel - currentFuel;
            this.distanceTraveled += amountOfkm;
            return currentFuel;
        }else {
            return -1 ;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.distanceTraveled);
    }
}
