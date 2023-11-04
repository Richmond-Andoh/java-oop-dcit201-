  
public class Car {
    private double fuelEfficiency;
    private int fuelInTank;

    public Car(double fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }
    
    public void drive(double miles){
        double amountOfFuelConsumed = miles / this.fuelEfficiency;

        if(amountOfFuelConsumed <= this.fuelInTank){
            this.fuelInTank -= amountOfFuelConsumed;
        }
        // else {
        //     System.out.println("Not enough fuel to complete trip");
        // }
    }
    public void addGas(int amountOfGasAdded) {
        this.fuelInTank += amountOfGasAdded;
    }

    public double getGasLevel() {
        return fuelInTank;
    }
}
