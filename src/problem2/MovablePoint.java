package problem2;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;

    private float ySpeed = 0.0f;


    public MovablePoint(){
        super();
    }

    // 4 value parameterized constructor here

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){

        super(x,y);

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // 2 value parameterized constructor here

    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    // getters here

    public float getXSpeed(){
        return xSpeed;
    }

    public float getYSpeed(){

        return ySpeed;
    }


    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;


    }

    // setters here

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;

    }




    // setting both
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    // to return an object from the array

        public MovablePoint move() {
    setX(getX() + xSpeed);
    setY(getY() + ySpeed);
    return this;
    }


    // here is where overide will be asigned
    // even with co=pilot off the new VSCODE update will auto enter it
    // ive been removing it in projects so far


    @Override
    public String toString(){
        return "(" + getX() + ". " + getY() + ")" + ", speed is " + xSpeed + ", " + ySpeed + ")";
    }




}
