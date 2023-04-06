public class HelloWorld {

    public static void main(String[] args){
        //1
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);
        //2
        String myString = "Shaka Brah";
        System.out.println(myString);
        //3
        //myString = 'c'; // wrong data type
        //4
        //myString = 3.14159; // wrong data type
        //5
        long myNumber;
        //System.out.println(myNumber); //wont work without initializing the variable
        //6
        //myNumber = 3.14; //wrong data type
        //7
        myNumber = 123L; // works because 123 is within the long number range
        //8
        myNumber = 123; //cannot assign a double or float value to a variable with data type of int or Long
        //9
        //float myNumber = 123; // doesnt work because myNumber has already been declared as a "long" data type and cant be re-declared.
                                // we could declare a new variable, or we can remove or change the old declaration to fix this.
        //10
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);

        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);
        // The reason they are different is because of the placement of the incrementer. ++i increments the value and returns it. i++ returns the value then increments it.

        //11
        //String class = "hi"; cannot use the word class as a variable because it is a reserved word in the java syntax

        //12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        // they do not work because you are trying to cast incompatible data types with each other.
        // the two errors are are java.lang.String cannot be converted to int so you cant cast completely different data types

        //13
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        //14
//        byte smol = 10000;
//        System.out.println(smol);
        //incompatible types: possible lossy conversion from int to byte - because you are trying to put a value that is too large for the data type to hold.













    }
}
