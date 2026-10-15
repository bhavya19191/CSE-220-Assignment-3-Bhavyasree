
package Shapes.TwoDim.NonPolygon;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * superAreaRadius();
    }

    private double superAreaRadius() {
        return Math.sqrt(area() / Math.PI);
    }
}
