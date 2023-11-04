public class TestPersonClass {
    public static void main(String[] args){
        Student student1 = new Student("Richmond Andoh", 2002, "Computer Science");
        Instructor instructor1 = new Instructor("John Boy", 2000, 200.34);

        System.out.println("Student name: " + student1.getName());
        System.out.println("Student name: " + student1.getYearOfBirth());
        System.out.println("Student name: " + student1.getMajor());

        System.out.println("Instructor's name: " + instructor1.getName());
        System.out.println("Instructor's name: " + instructor1.getYearOfBirth());
        System.out.println("Instructor's name: " + instructor1.getSalary());
    }
}
