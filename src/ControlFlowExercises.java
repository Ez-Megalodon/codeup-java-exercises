import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1.a
//        int i = 5;
//        while (i<=15){
//            System.out.println(i);
//            i++;
//        }

        // 1.b
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int i = 100;
//        do {
//            i -= 5;
//            System.out.println(i);
//        } while (i > -10);

//        int i = 2;
//        do {
//            i *= i;
//            System.out.println(i);
//        } while (i <= 65000);

        //refactor using for loops
        // 1.a
//        int a = 5;
//        for (int i = 0; i <= 10; i++){
//            System.out.println(a);
//            a += 1;
//        }
        //1.b
//        for (int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

        //2
//        for (int i = 1; i < 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //3
        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int userNum = Integer.parseInt(sc.nextLine());
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (long i = 1; i <= userNum; i++){
//            long userSquared = i * i;
//            long userCubed = i * i * i;
//            System.out.printf("%-7s| %-8s| %-6s%n", i, userSquared, userCubed);
//            if (i == userNum){
//                System.out.println("Would you like to continue? [y/n]");
//                String userInput = sc.nextLine();
//                boolean confirm = userInput.equalsIgnoreCase("y");
//                if (confirm){
//                    System.out.println("Please enter a integer that you would like to continue to.");
//                    userNum = Integer.parseInt(sc.nextLine());
//                }
//
//            }
//        }

        //4
        System.out.println("What did you score on your test? (0-100)");
        int userNumToGrade = Integer.parseInt(sc.nextLine());
        if (userNumToGrade <= 59){
            System.out.println("You scored an F.");
        } else if (userNumToGrade <= 66) {
            System.out.println("You scored an D.");
        } else if (userNumToGrade <= 79) {
            System.out.println("You scored an C.");
        } else if (userNumToGrade <= 87) {
            System.out.println("You scored an B.");
        } else {
            System.out.println("You scored an A.");
        }
    }
}
