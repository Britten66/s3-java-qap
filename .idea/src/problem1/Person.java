package problem1;

public class Person {


    protected String myName;
    protected String myGender;
    protected int myAge;


    public Person(String name, String gender, int age) {

        myName = name;

        myGender = gender;

        myAge = age;

    }
        // getters

        public String getName () {
            return myName;
        }

        public int getAge () {
            return myAge;
        }

        public String getGender () {
            return myGender;
        }


        // seters here


        public void setName (String name) {
            myName = name;

        }
    public void setAge(int age ){
        myAge = age;

    }
    public void setGender(String gender){
        myGender = gender;

    }


        // printing out here

        public String toString () {

            return myName + ", age: " + myAge + ", gender " + myGender;
        }


    }
