public class Student extends Person {

    protected String myIdNum;
    protected double myGPA;


    public Student(String name, int age, String gender, String idNum, double gpa) {

        // calling super to reach the params of Person class

        super(name, gender, age);

        myIdNum = idNum;
        myGPA = gpa;

    }
  

    }
