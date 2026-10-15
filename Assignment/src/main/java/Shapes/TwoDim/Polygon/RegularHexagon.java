
        package Shapes.TwoDim.Polygon;

import Shapes.TwoDim.TwoDimShape;
import Shapes.TwoDim.Enums.TwoDimCategory;

public class RegularHexagon extends TwoDimShape {
    private final double side;

    public RegularHexagon(double side) {
        if (!Double.isFinite(side) || side <= 0) {
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }

    @Override
    public TwoDimCategory getCategory() {
        return TwoDimCategory.POLYGON;
    }
}
