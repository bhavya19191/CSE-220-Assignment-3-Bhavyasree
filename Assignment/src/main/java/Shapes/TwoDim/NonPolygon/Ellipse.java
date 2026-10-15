
        package Shapes.TwoDim.NonPolygon;

import Shapes.TwoDim.TwoDimShape;
import Shapes.TwoDim.Enums.TwoDimCategory;

public class Ellipse extends TwoDimShape {
    private final double a;
    private final double b;

    public Ellipse(double a, double b) {
        if (!Double.isFinite(a) || !Double.isFinite(b)
                || a <= 0 || b <= 0 || a < b) {
            throw new IllegalArgumentException();
        }

        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        double h = Math.pow(a - b, 2) / Math.pow(a + b, 2);
        return Math.PI * (a + b)
                * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public TwoDimCategory getCategory() {
        return TwoDimCategory.NON_POLYGON;
    }
}
