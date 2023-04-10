import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ask Bob a question!");
        String userInput = sc.nextLine();
        if (userInput.isEmpty()){
            System.out.println("Bob answers: 'Fine. Be that way!'");
        } else {
            String questionOrYelling = userInput.substring(userInput.length() - 1);
            if (questionOrYelling.equals("?")) {
                System.out.println("Bob answers: 'Sure!'");
            } else if (questionOrYelling.equals("!")) {
                System.out.println("Bob answers: 'Whoa Chill out!'");
            } else {
                System.out.println("Bob answers: 'Whatever.'");
            }
        }
    }
}
