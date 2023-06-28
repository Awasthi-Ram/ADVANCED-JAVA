package newrev;

class FourSidePolygon1 {
    double length;
    double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Rectangle extends FourSidePolygon1 {
    // No additional attributes or methods needed for Rectangle
    public double area() {
        return super.length * super.width;
    }
}

class Square extends FourSidePolygon1 {
    double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
}

public class foursidepolygon {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(4);
        System.out.println("aera of rectangle is " + rectangle.area());

        Square square = new Square();
        square.setSideLength(6);
        System.out.println("area of square " + square.area());
    }
}
