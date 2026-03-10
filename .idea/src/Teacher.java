public class Teacher extends Person{

    protected String subject;
    protected double salary;



    // parameterized constructor here
    // this will handle person
    public Teacher (String name, int age, String gender, String subject, double salary){

        // super here thiis is doing the same as before in the student class

        super(name, gender, age);
        this.subject = subject;
        this.salary = salary;


    }

    // getter




}
