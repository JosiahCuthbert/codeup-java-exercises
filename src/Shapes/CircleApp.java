package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){

        Input input = new Input();

        Circle circle = new Circle(input.getDouble(1, 10));

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }

//    private static int counter = 0;

//    public void createCircles(){
//        do{
//            Input input = new Input();
//            Boolean userContinue;
//
//            double radiusInput = input.getDouble();
//
//            Circle circle = new Circle(radiusInput);
//
//            getCount++
//
//        }   while()
//    }

}
