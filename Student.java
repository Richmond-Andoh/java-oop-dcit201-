// 2.	Implement a class Student. For the purpose of this exercise, a student has a name
// and a total quiz score. Supply an appropriate constructor and methods getName(),
// addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you also need to store the number of quizzes that the student took.

public class Student {
    private String name;
    private int totalQuizScore;
    private int numberOfQuizzes;

    public Student(String name){
        //default constructor
        this.name = name;
        this.totalQuizScore = 0;
        this.numberOfQuizzes = 0;
    }

    public String getName(){
        return this.name;
    }

    public void addQuiz(int score) {
        this.totalQuizScore += score;
        this.numberOfQuizzes++;
    }

    public int getTotalScore(){
        return this.totalQuizScore;
    }

    public double getAverageScore(){
        if (this.numberOfQuizzes == 0){
            System.out.println("No scores have been added yet.");
        }
    
        return ((double)this.totalQuizScore / this.numberOfQuizzes);
        
    }
}

// public class Student extends Person {
//     private String major;

//     public Student(String name, int yearOfBirth, String major){
//         super(name, yearOfBirth);
//         this.major = major;
//     }

//     public String getMajor() {
//         return this.major;
//     }

// }
