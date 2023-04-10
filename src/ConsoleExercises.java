import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f: %n", pi);
        //Explore the Scanner Class.
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer");
        int userNum = scanner.nextInt();
        System.out.printf("You entered: %s %n", userNum);
        // if entered a string then it throws an exception called InputMismatchException

        //2
        System.out.println("Please enter 3 words seperated by spaces.");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("You entered the words: %s, %s, and %s. %n", word1, word2, word3);

        //3 , and problem 4
        System.out.println("Please enter a sentence!");
        scanner.nextLine(); //clear input buffer
        String userSentence = scanner.nextLine();
        System.out.printf("You entered:  '%s' %n", userSentence);

        //Calculate the perimeter and area of Codeup's classrooms.
        //1
        System.out.println("Please enter the width (in footage)");
        float width = Float.parseFloat(scanner.nextLine());

        System.out.println("Please enter the length (in footage)");
        float length = Float.parseFloat(scanner.nextLine());

        float perimeter = width * width + length * length;
        float sqFootage = width * length;
        System.out.printf("The square footage in your classroom is: %s sqft, %nThe perimeter length of the classroom is %s ft.", sqFootage, perimeter);

        //bonus (unfinished)
//        Scanner scPeriod = new Scanner(System.in).useDelimiter("//.");
//        System.out.println("Please enter the width and length seperated with a period. example: 12.14");
//        int width = Integer.parseInt(scPeriod.next());
//        int length = Integer.parseInt(scPeriod.next());
//
//        int perimeter = width * width + length * length;
//        int sqFootage = width * length;
//        System.out.printf("The square footage in your classroom is: %s sqft, %nThe perimeter length of the classroom is %s.", sqFootage, perimeter);




    }
}
