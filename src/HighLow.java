import java.util.Scanner;

public class HighLow {
    public static void main (String[] args){
        guessGame();
    }

    public static void guessGame (){
        Scanner sc = new Scanner(System.in);
        int rand = randomNumber(1,100);
        int i = 0;
        System.out.println("Guess the number between 1 and 100!");
        int userGuess = Integer.parseInt(sc.nextLine());
        if (userGuess != rand) {
            do {
                i++;
                if (userGuess > rand) {
                    System.out.println("LOWER");
                } else {
                    System.out.println("HIGHER");
                }
                userGuess = Integer.parseInt(sc.nextLine());
            } while (userGuess != rand);
        }
        System.out.println("GOOD GUESS.\nNumber of guesses: " + i);

        System.out.println("Play again? [y/n]");
        boolean playAgain = sc.nextLine().trim().equalsIgnoreCase("y");
        if (playAgain){
            guessGame();
        }
    }

    public static int randomNumber (int min, int max){
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}
