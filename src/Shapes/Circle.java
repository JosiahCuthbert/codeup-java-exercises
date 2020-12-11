package Shapes;

public class Circle {

    public double circleRadius;

    public final double pi = 3.14159;

    public Circle(double radius){
        circleRadius = radius;
    }

    public double getArea(){
        return pi*circleRadius*circleRadius;
    }
    

    public double getCircumference(){
        return pi*circleRadius*2;
    }

    private static int count = 0;

    public static int getCount(){
        return count;
    }


}
