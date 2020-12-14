package Shapes;

public class ShapesTest {

    public static void main(String[] args){

        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);

        printRect(box1);
        printRect(box2);

    }

    public static void printRect(Rectangle rectangle){
        System.out.println("The area of this rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of this rectangle is: " + rectangle.getPerimeter());
    }

}
