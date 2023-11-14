public class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car engine stopped");
    }
}
