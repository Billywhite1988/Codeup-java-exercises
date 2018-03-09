package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        String userInput;

        System.out.println("");
        System.out.println("Welcome to the Grade Application");
        System.out.println("--------------------------------------------------");
        students = addGithubGrades();

        for(String key : students.keySet()) {
            System.out.print(key + "  |  ");
        }

        System.out.println();
        System.out.println("--------------------------------------------------");

        do {

            System.out.println("Here are the github usernames of our students");
            userInput = input.getString();

            if(students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println(student.getName() + "\n Has a grade average of " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the github username of");
            }

        } while (input.yesNo(true));

        System.out.println("Goodbye, and have a wonderful day!");

    }


    public static HashMap<String, Student> addGithubGrades() {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Name: RayRay - Github Username: Lil-Ray14");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(80);
        student1.addGrade(99);
        student1.addGrade(95);


        Student student2 = new Student("Name: Angela - Github Username: Angela-Reina08");
        student2.addGrade(85);
        student2.addGrade(80);
        student2.addGrade(75);
        student2.addGrade(70);
        student2.addGrade(65);

        Student student3 = new Student("Name: Amber - Github Username: Amber-Nicole96");
        student3.addGrade(60);
        student3.addGrade(65);
        student3.addGrade(55);
        student3.addGrade(50);
        student3.addGrade(45);


        students.put("Lil Ray14", student1);
        students.put("Angela Reina08", student2);
        students.put("Amber Nicole96", student3);


        return students;
    }

}