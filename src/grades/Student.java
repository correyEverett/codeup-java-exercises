package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public void setName (String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(String name) {
        return this.name = name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(ArrayList<Integer> grades) {
        for (int grade : grades) {
            return grade += grade;
        }
        return grade / this.grades.size();
    }






}
