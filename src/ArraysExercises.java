import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person person1 = new Person("Ezra");
        Person person2 = new Person("Marc");
        Person person3 = new Person("Conner");

        Person[] personArray = {person1,person2,person3};

        for (Person person : personArray){
            System.out.println(person.getName());
        }
        System.out.println("-----------new array------------");
        Person person4 = new Person("JoeBob");
        Person[] newPersonArray = Person.addPerson(personArray, person4);
        for (Person person : newPersonArray){
            System.out.println(person.getName());
        }

    }
}
