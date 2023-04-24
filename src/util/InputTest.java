package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("enter a string");
//        System.out.printf("user entered: %s%n",input.getString());
//
//        System.out.printf("user entered: %s%n",input.getString("Enter another string"));
//
//        System.out.println("continue? [y/n]");
//        System.out.printf("user selected: %b%n",input.yesNo());
//
//        boolean confirm = input.yesNo("continue? [y/n]");
//        System.out.printf("user selected: %b%n", confirm);
//
//        System.out.println("enter a integer");
//        System.out.printf("user entered: %d%n", input.getInt());
//
//        System.out.printf("user entered: %d%n", input.getInt("enter a integer"));
//
//        System.out.println("enter a integer between 1 and 10");
//        System.out.printf("user entered: %d%n", input.getInt(1, 10));
//
//        System.out.printf("user entered: %d%n", input.getInt(1, 10,"Enter a integer between 1 and 10" ));
//
//        System.out.println("Please enter a 'double' number.");
//        System.out.printf("User entered: %.2f%n", input.getDouble());
//
//        System.out.printf("User entered: %.2f%n", input.getDouble("Please enter a 'double' number."));
//
//        System.out.println("Please enter a 'double' number between 1 & 10.");
//        System.out.printf("User entered: %.2f%n", input.getDouble(1, 10));

        System.out.printf("User entered: %.2f%n", input.getDouble(1, 10, "Please enter a 'double' number between 1 & 10."));
        System.out.println("Enter a binary value.");
        String binary = input.getString();
        System.out.printf("Binary value of %s = %s%n",binary,input.getBinary(binary));

        System.out.println("\nEnter a Hex value.");
        String hex = input.getString();
        System.out.printf("Hex value of %s = %s",hex, input.getHex(hex));
    }
}
