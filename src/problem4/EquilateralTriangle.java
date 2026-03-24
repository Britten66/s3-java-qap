package problem4;

public class EquilateralTriangle extends Triangle{


    // thius will extend triangle and all sides being equal we will just pass the values through aa constructor

    public EquilateralTriangle(double side){

        super(side, side, side);

        name = "Equilateral Triangle";

    }

//    ^^^ that will pass the new name to Triangle as equalateral







}
