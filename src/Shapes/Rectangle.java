package Shapes;

import org.w3c.dom.css.Rect;

public class Rectangle {

    protected int width;

    protected int length;

    public Rectangle(int recWidth, int recLength){
        this.width = recWidth;
        this.length = recLength;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (this.length + this.width)*2;
    }
}
