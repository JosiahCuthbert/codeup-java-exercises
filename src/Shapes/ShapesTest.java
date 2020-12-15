package Shapes;

public class ShapesTest {

    public static void main(String[] args){

        Measurable myRect = new Rectangle(4, 3);

        Measurable mySquare = new Square(5);

        printShape(myRect);
        System.out.println();
        printShape(mySquare);

        myRect.setLength(6);
        myRect.setWidth(7);
        mySquare.setWidth(6);

        System.out.println();
        printShape(myRect);
        System.out.println();
        printShape(mySquare);
        System.out.println();
        System.out.println(myRect.getWidth());
        System.out.println(mySquare.getLength());



    }

    public static void printShape(Measurable shape){
        System.out.println("The area of this shape is: " + shape.getArea());
        System.out.println("The perimeter of this shape is: " + shape.getPerimeter());
    }

}
