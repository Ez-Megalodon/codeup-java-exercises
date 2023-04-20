package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student();
        student1.setName("Ezra");
        student1.setGrades(new ArrayList<>(List.of(67,89,90)));
//        System.out.printf("%s's grade average is: %.2f", student1.getName(),student1.getGradeAverage());

        Student student2 = new Student();
        student2.setName("Marc");
        student2.setGrades(new ArrayList<>(List.of(64,86,59)));
//        System.out.printf("%n%s's grade average is: %.2f", student2.getName(),student2.getGradeAverage());

        Student student3 = new Student();
        student3.setName("Conner");
        student3.setGrades(new ArrayList<>(List.of(89,88,56)));
//        System.out.printf("%n%s's grade average is: %.2f", student3.getName(),student3.getGradeAverage());

        Student student4 = new Student();
        student4.setName("Matt");
        student4.setGrades(new ArrayList<>(List.of(73,79,87)));
//        System.out.printf( "%n%s's grade average is: %.2f%n", student4.getName(),student4.getGradeAverage());

        students.put("Ez-Megalodon", student1);
        students.put("Marc-maximus", student2);
        students.put("Condor-plane", student3);
        students.put("matt-phew", student4);

//        System.out.println(students.get("Ez-Megalodon").getName());
//        System.out.println(students.get("Ez-Megalodon").getGradeAverage());

        boolean userContinue = true;
        String userInput;
        String target = "";
        AtomicReference<Double> total = new AtomicReference<>((double) 0);
        AtomicInteger i = new AtomicInteger();

        System.out.println("Welcome!\n");
        do {
            System.out.println("Here are the GitHub usernames of our students:\n");

            for (String key : students.keySet()) {
                System.out.printf("|%s| ", key);
            }
            System.out.println("\n1: Show all grades");
            System.out.println("2: Overall class average");
            System.out.println("3: Report all students");
            System.out.println("\nWhat student would you like to see more information on?");

            userInput = input.getString();
            if (userInput.equalsIgnoreCase("1")){
                System.out.println("---------------------------");
                System.out.println("|         Grades          |");
                System.out.println("---------------------------");
                students.forEach((key,value) ->{
                    System.out.printf("| %-10s ",students.get(key).getName());
                    System.out.printf("%s |%n", students.get(key).getGrades());
                });
                System.out.println("---------------------------");

                userContinue = input.yesNo("\nWould you like to continue? [y/n]");
                if (!userContinue){
                    break;
                } else {
                    continue;
                }
            }

            if (userInput.equalsIgnoreCase("2")){
                students.forEach((student, object) -> {
                        total.updateAndGet(v -> new Double((double) (v + object.getGradeAverage())));
                        i.getAndIncrement();
                });
                System.out.println(" ------------------------------");
                System.out.printf("| Overall class average: %.2f |", total.get()/ i.get());
                System.out.println("\n ------------------------------");

                userContinue = input.yesNo("\nWould you like to continue? [y/n]");
                if (!userContinue){
                    break;
                } else {
                    continue;
                }
            }

            if (userInput.equalsIgnoreCase("3")){
                System.out.println("-------------------------------");
                System.out.println("|           Report            |");
                System.out.println("-------------------------------");
                students.forEach((key,value) ->{
                    System.out.printf("| %-6s %-14s %-5.2f |%n",students.get(key).getName(), key, students.get(key).getGradeAverage());
                });
                System.out.println("-------------------------------");

                userContinue = input.yesNo("\nWould you like to continue? [y/n]");
                if (!userContinue){
                    break;
                } else {
                    continue;
                }
            }

            for (String key : students.keySet()) {
                if (userInput.equals(key)) {
                    target = key;
                }
            }

            if (!target.isEmpty()) {
                System.out.printf("Name: %s - GitHub Username: %s %nCurrent Average: %.2f%n", students.get(target).getName(), userInput, students.get(userInput).getGradeAverage());
                System.out.printf("Grades: ");
                for (Integer grade: students.get(target).getGrades()){
                    System.out.printf("%s ", grade);
                }
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userInput);
            }

            userContinue = input.yesNo("\nWould you like to see another student? [y/n]");
            if (!userContinue){
                userContinue = false;
            }

        } while (userContinue);

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
