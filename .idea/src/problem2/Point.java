package problem2;

public class Point {

    private float x = 0.0f;

    private float y = 0.0f;


    public Point (){

    }


public Point(float x, float y) {

    this.x = x;

    this.y = y;

}

//personal note
// always setting it as an assign instead of returning,
// habit trying to break for a while now


// getters here


    public float getX(){
       return x;
    }


    public float getY(){
        return y;
    }


  public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
     }





    // setters here


    public void setX(float x){
        this.x = x;
    }



    public void setY(float y){

        this.y = y;
    }



    public void setXY(float x, float y){

        this.x = x;
        this.y = y;
    }

    // setting both x and y here

    public String toString () {

        return "(" + x + ", " + y + ")";

    }






}
