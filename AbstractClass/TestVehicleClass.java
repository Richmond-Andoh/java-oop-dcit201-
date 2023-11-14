public class TestVehicleClass {
    public static void main(String[] args) {
        Car car = new Car();
        MotorCycle motorCycle = new MotorCycle();

        car.startEngine();
        car.stopEngine();

        motorCycle.startEngine();
        motorCycle.stopEngine();
    }
    
}
