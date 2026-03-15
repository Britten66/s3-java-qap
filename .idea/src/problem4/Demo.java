package problem4;

public class Demo {

     // writing a method here that will take in scalable array and factor

    public static void scaleAll(Shape[] items, double factor){

        for(Shape item : items){
            item.scale(factor);
        }
    }

    public static void main(String[] args){


        Shape[] shapeList = new Shape[4];


        shapeList[0] = new Circle(5);
        shapeList[1] = new Ellipse(8,4);
        shapeList[2] = new Triangle(3,4,5);
        shapeList[3] = new EquilateralTriangle(6);


        for (Shape s : shapeList) {
            System.out.println(s);
        }

        // scaling all by 2

        scaleAll(shapeList, 2);

        System.out.println( "--Here is after scaling--");
        for(Shape s : shapeList){
            System.out.println(s);
        }

    }


}
