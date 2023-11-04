public class TestCarClass {
    public static void main(String[] args){
        Car myMercedesCar = new Car(300);
        myMercedesCar.addGas(30);
        myMercedesCar.drive(180);

        System.out.println(myMercedesCar.getGasLevel());
    }
}
