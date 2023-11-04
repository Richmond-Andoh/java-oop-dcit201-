
// 5.	Make a class Employee with a name and salary. 
// Make a class Manager inherit from Employee. 
// Add an instance variable, named department, of type String. Supply a method toString that prints the manager’s name, department, and salary. 
// Make a class Executive inherit from Manager. Supply appropriate toString methods for all classes.
//  Supply a test program that tests these classes and methods.
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return ("Employee: " + this.name + "Salary $ " + this.salary);
    }

}
