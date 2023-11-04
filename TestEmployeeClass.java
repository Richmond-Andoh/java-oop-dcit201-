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
