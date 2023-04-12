package util;

public class InputTest {
    public static void main(String[] args) {

        System.out.println("Enter a String.");
        String userInput = Input.getString();
        System.out.printf("user has entered: %s%n", userInput);

        int min = 1;
        int max = 10;
        System.out.printf("Enter a number between %d & %d%n", min, max);
        int userNum = Input.getInt(min, max);
        System.out.printf("user has entered %d", userNum);

        double doubleMin = 1;
        double doubleMax = 10;
        System.out.printf("Enter a decimal number between %.2f & %.2f%n", doubleMin, doubleMax);
        double userDoubleNum = Input.getDouble(doubleMin, doubleMax);
        System.out.printf("user has entered %.2f", userDoubleNum);


    }

}
