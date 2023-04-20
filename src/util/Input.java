package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // initiate scanner tool for every input class created
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    // get user input string
    public String getString(){
        return this.scanner.nextLine();
    }
    // get user input string with optional prompt
    public  String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    // confirm user action with [y/n] Input
    public boolean yesNo(){
        String userInput = this.scanner.nextLine().trim();
        if (userInput.isEmpty() || userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }
    // confirm user action with [y/n] format
    // optional prompt
    public boolean yesNo (String prompt){
        System.out.println(prompt);
        String userInput = this.scanner.nextLine().trim();
        if (userInput.isEmpty() || userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }
    // get user entered int from input
    public int getInt(){
        int userNum;
        do {
            try {
                userNum = Integer.parseInt(this.scanner.nextLine());
                return userNum;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        } while (true);
    }
    // get user entered int from input
    //optional prompt
    public int getInt (String prompt){
        int userNum;
        do {
            System.out.println(prompt);
            try {
                userNum = Integer.parseInt(this.scanner.nextLine());
                return userNum;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        } while (true);
    }
    //get user int that is between a min and max integer
    public int getInt (int min, int max){
            int userNum;
            do {
                try {
                    userNum = Integer.parseInt(scanner.nextLine());
                    if (userNum >= min && userNum <= max) {
                        System.out.println("Integer accepted");
                        return userNum;
                    } else {
                        System.out.printf("Please enter a number between %d & %d", min, max);
                    }
                } catch (NumberFormatException e) {
                    System.out.printf("Invalid input! Enter a integer between: %d & %d%n", min, max);
                }
            } while (true);
    }
    //get user int that is between a min and max integer
    // optional prompt
    public int getInt(int min, int max, String prompt) {
        int userNum;
        do {
            System.out.println(prompt);
            try {
                userNum = Integer.parseInt(this.scanner.nextLine());
                if (userNum >= min && userNum <= max) {
                    System.out.println("Integer accepted");
                    return userNum;
                } else {
                    System.out.printf("Please enter an integer between %d and %d.%n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        } while (true);
    }
    //get user entered double
    public double getDouble(){
        double userNum;
        do {
            try {
                userNum = Double.parseDouble(this.scanner.nextLine());
                return userNum;
            } catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a 'double' number.");
            }
        } while (true);
    }
    //get user double
    // optional prompt
    public double getDouble(String prompt){
        double userNum;
        do {
            try{
                System.out.println(prompt);
                userNum = Double.parseDouble(this.scanner.nextLine());
                return userNum;
            } catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a 'double' number.");
            }
        } while (true);
    }
    //get user int that is between a min and max double
    public double getDouble(double min, double max){
        double userNum;
        do {
            try {
                userNum = Double.parseDouble(this.scanner.nextLine());
                if (userNum >= min && userNum <= max) {
                    System.out.println("Number accepted.");
                    return userNum;
                } else {
                    System.out.printf("Please enter a number between %.2f and %.2f.%n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        } while (true);
    }
    //get user int that is between a min and max double
    //optional prompt
    public double getDouble(double min, double max, String prompt) {
        double userNum;
        do {
            System.out.println(prompt);
            try {
                userNum = Double.parseDouble(this.scanner.nextLine());
                if (userNum >= min && userNum <= max) {
                    System.out.println("Number accepted.");
                    return userNum;
                } else {
                    System.out.printf("Please enter a number between %.2f and %.2f.%n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        } while (true);
    }
}
