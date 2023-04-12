public class Person {
    public static void main (String[]args){
        //1 - Object basics
        //testing new NoArg constructor for person class
//        Person person1 = new Person();
        //testing getter and setter for Person class
//        person1.setName("Meebo");
//        System.out.println(person1.getName());
//        person1.sayHello();

        //using the constructor to test the arguments being passed.
//        Person person2 = new Person("Ezra");
//        person2.sayHello();

        //1 - Understanding references - copy/paste tests
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("%s says HELLO EVERYONE%n", name);
    }

    public Person() {
    }

    public Person(String name){
        this.name = name;
    }


}
