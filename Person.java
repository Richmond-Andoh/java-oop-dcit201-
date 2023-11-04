// 4.Implement a superclass Person. 
// Make two classes, Student and Instructor, that inherit from Person.
//  A person has a name and a year of birth. 
//  A student has a major, and an instructor has a salary.
//   Write the class declarations and constructors for all classes. 
//   Supply a test program that tests these classes and methods.
public class Person {
    private String  name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return this.name;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
}



