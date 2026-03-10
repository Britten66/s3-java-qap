public class Student extends Person {

    protected String myIdNum;
    protected double myGPA;


    public Student(String name, int age, String gender, String idNum, double gpa) {

        // calling super to reach the params of Person class

        super(name, gender, age);

        myIdNum = idNum;
        myGPA = gpa;

    }

    //getters here

    public String getIdNum(){
        return myIdNum;
    }


    public double getGPA(){
        return myGPA;
    }

    // setters for id num and gpa here

    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }



    public String toString() {
        return super.toString() + "  , ID" + myIdNum + " , GPA " + myGPA;
    }
}
