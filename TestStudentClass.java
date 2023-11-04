import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class TestStudentClass {
    public static void main(String[] args){
        Student student1 = new Student("John");

        student1.addQuiz(80);
        student1.addQuiz(89);
        student1.addQuiz(67);

        System.out.println("Student Name " + student1.getName());
        System.out.println("Total Score: "+student1.getTotalScore());
        System.out.println("The average score is" + student1.getAverageScore());




        // Country country1 = new Country();
    
    }
}