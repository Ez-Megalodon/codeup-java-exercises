import java.util.Scanner;

public class MethodsExercises {

    public static void main(String [] args){
//        int number1 = 10;
//        int number2 = 5;
//        System.out.println("add method: " + addMethod(number1, number2));
//        System.out.println("subtract method: " + subtractMethod(number1,number2));
//        System.out.println("multiply method: " + multiplyMethod(number1,number2));
//        System.out.println("divide method: " + divideMethod(number1, number2));
//        System.out.println("modulus method: " + modulusMethod(number1, number2));
//        System.out.println("recursion multiply method: " + recursionMultiply(number1,number2));
//        int userNum = getUserInt(1, 10);
//        System.out.println("User has entered: " + userNum);
//        getFactorial();
//        diceRoll();

    }

    public static int addMethod (int num, int num2){
        return num + num2;
    }
    public static int subtractMethod (int num, int num2){
        return num - num2;
    }
    public static int multiplyMethod (int num, int num2){
        int result = 0;
        for(int i = 0; i < num2; i++){
            result += num;
        }
        return result;
    }
    public static int recursionMultiply (int num, int num2){
        if (num == 0 || num2 == 0) {
            return 0;
        } else {
            return num + recursionMultiply( num, num2 -1);
        }
    }
    public static int divideMethod (int num, int num2){
        return num / num2;
    }
    public static int modulusMethod( int num, int num2){
        return num % num2;
    }

    public static int getUserInt (int num, int num2){
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        System.out.println("Please enter a integer between 1 and 10");
        userNum = Integer.parseInt(sc.nextLine());
        if (userNum < num || userNum > num2){
            System.out.println("Integer is out of allowed range");
            System.out.println("-------------------------------");
            userNum = getUserInt(num, num2);
        }
        return userNum;
    }

    public static void getFactorial (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userNum = Integer.parseInt(sc.nextLine());

        long result = 1;
        String multi = "1";
        for (int i = 1; i <= userNum; i++){
            if (i > 1){
                multi = multi.concat(" * " + i);
            }
            result *= i;
        }

        System.out.println(userNum + "!" + " = " + multi + " = " + result);
        System.out.println("Would you like to continue? [y/n]");
        String userChar = sc.nextLine().trim();
        boolean confirm = userChar.equalsIgnoreCase("y");
        if (confirm){
            getFactorial();
        }
    }

    public static void diceRoll (){
        Scanner sc = new Scanner(System.in);
        System.out.println("How sides are there on the pair of dice?");
        int diceSides = Integer.parseInt(sc.nextLine());
        System.out.println("Roll the dice? [y/n]");
        boolean confirm = sc.nextLine().equalsIgnoreCase("y");
        if (confirm){
            do {
                int die1 = randomNumber(1, diceSides);
                int die2 = randomNumber(1, diceSides);
                System.out.printf("Rolled: %s , %s%n", die1, die2);
                System.out.println("Would you like to roll again? [y/n]");
                confirm = sc.nextLine().trim().equalsIgnoreCase("y");
            }while (confirm);

            System.out.println("Would you like to start over? [y/n]");
            boolean confirm2 = sc.nextLine().trim().equalsIgnoreCase("y");
            if (confirm2){
                diceRoll();
            }
        }
    }

    public static int randomNumber (int min, int max){
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}
