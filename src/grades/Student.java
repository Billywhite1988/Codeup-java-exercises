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

    public double getGradeAverage() {
        int numberOfgrades = grades.size();
        double sumOfAllGrades = 0;
        double average;


        for (int grade : grades) {
            sumOfAllGrades += grade;
        }

        average = sumOfAllGrades / numberOfgrades;

    }

}

