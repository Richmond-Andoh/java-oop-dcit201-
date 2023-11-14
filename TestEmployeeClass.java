public class TestEmployeeClass {
    public static void main(String[] args){
        Employee employee1 = new Employee("Bismark", 836.73);
        Manager manager1 = new Manager("Richmond Andoh", 300.45, "Computer Science");
        Executive executive1 = new Executive("John Doe", 439.00, "Accounting");

        System.out.println(employee1);
        System.out.println(manager1);
        System.out.println(executive1);
    }
}

// 1.	Implement a class Car with the following properties. A car has a certain
// fuel efficiency (measured in miles/gallon) and a certain amount of fuel
// in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. 
// Supply a method drive that simulates driving the car for a certain distance, reducing the fuel level in the gas tank, and methods getGasLevel, to return the current fuel level, and addGas, to tank up. 

// Sample usage:

// Car myHybrid = new Car(50);  // 50 miles per gallon

// myHybrid.addGas(20);       // Tank 20 gallons

// myHybrid.drive(100);       // Drive 100 miles

// // Print fuel remaining
// System.out.println(myHybrid.getGasLevel());  
