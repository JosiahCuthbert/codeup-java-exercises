package Shapes;

abstract class Shape {

    abstract static class Quadrilateral extends Shape implements Shapes.Measurable{

        protected double length;
        protected double width;

        @Override
        public double getLength() {
            return length;
        }

        @Override
        public void setLength(double length) {
            this.length = length;
        }



        public Quadrilateral(double qLength, double qWidth){





        }
    }

}
