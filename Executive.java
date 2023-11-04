// Make a class Executive inherit from Manager. Supply appropriate toString methods for all classes.

public class Executive extends Manager{

    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }

    @Override
    public String toString(){
        return ("Executive: " + super.toString());
    }
}
