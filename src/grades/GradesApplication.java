package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main() {

        HashMap<String, Student> students = new HashMap<>();
        Student correy = new Student("Correy");
        students.put("cEverett", correy);
        correy.addGrade(99);
        correy.addGrade(100);
        correy.addGrade(85);

        Student ryan = new Student("ryan");
        students.put("rPhillips", ryan);
        ryan.addGrade(100);
        ryan.addGrade(88);
        ryan.addGrade(99);

        Student evan = new Student("evan");
        students.put("eMead", evan);
        evan.addGrade(87);
        evan.addGrade(100);
        evan.addGrade(95);

        Student chris = new Student("chris");
        students.put("cParker", chris);
        chris.addGrade(100);
        chris.addGrade(93);
        chris.addGrade(84);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        for(Student student : students) {
            System.out.print("|" + students.get(student.getName()) + "| ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String seeInfo = "What student would you like to see more information on?";
        do {
            System.out.println(seeInfo);
            String userChoice = scan.nextLine().toLowerCase();
        }while(userChoice != "y" || userChoice != "yes");



    }
}
