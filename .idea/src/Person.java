public class Person {


    protected String myName;
    protected String myGender;
    protected int myAge;


    public Person(String name,String gender, int age) {

        myName = name;

        myGender = gender;

        myAge = age;



    }

    // printing out here

    public String toString(){

        return myName + ", age: " + myAge + ", gender " + myGender;
    }

    // practicing tests here

    static void main(String[] args) {
        Person bob = new Person("Bob", "M", 35);
        System.out.println(bob);
    }


}
