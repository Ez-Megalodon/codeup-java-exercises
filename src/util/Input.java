package util;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine().trim();
        if (userInput.isEmpty()){
            System.out.println("Please enter y/n");
            yesNo();
        }
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public static double getInt(){
        return scanner.nextInt();
    }

    public static int getInt(int min, int max){
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            System.out.println("Your number is in the acceptable range.");
            return userNum;
        } else {
            System.out.printf("Please enter a integer between: %d & %d%n", min, max);
            getInt(min, max);
            return 0;
        }
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }

    public static double getDouble(double min, double max){
        double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max) {
            System.out.println("Your number is in the acceptable range.");
            return userNum;
        } else {
            System.out.printf("Please enter a integer between: %.2f & %.2f%n", min, max);
            getDouble(min, max);
            return 0;
        }
    }

}
