// Add an instance variable, named department, of type String. Supply a method toString that prints the manager’s name, department, and salary. 

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name,salary);
        this.department = department;
    }

    @Override
    public String toString(){
        return ("Manager: " + super.toString() + "Department: " + this.department);
    }
}
