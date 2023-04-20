package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ezra");
        student1.addGrade(56);
        student1.addGrade(95);
        student1.addGrade(75);
        System.out.printf("%s's grade average is: %.2f", student1.getName(), student1.getGradeAverage());


    }

}
