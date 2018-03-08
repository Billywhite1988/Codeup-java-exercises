package grades;
import java.util.ArrayList;

public class Student {

    private String name;

//    declaring a arraylist
    private ArrayList<Integer> grades;

//    constructor that takes in a name argument and uses it to set the name
    public Student(String name) {
        this.name = name;

//    initializing grades
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getGradeAverage() {
        int numberOfgrades = grades.size();
        double sumOfAllGrades = 0;
        double average;


        for(int grade : grades) {
            sumOfAllGrades += grade;
        }

        average  = sumOfAllGrades / numberOfgrades;
        return average;

    }

    public void addGrade(int grade) {
        grades.add(grade);

}

//
//// Write just enough code in the main method to test the class's methods before using this class elsewhere...
public static void main(String[] args) {
        System.out.println("Testing the Student class");
        Student student = new Student("Angela");
        System.out.println("The number of elements in the grades array is " + student.grades.size() + "... Great! It work");
        System.out.println("Display three grades, a 100, a 90, and an 80");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        double expectedGrade = (100 + 90 + 80) / 3;
        System.out.println("The average is " + expectedGrade);


        }



}
