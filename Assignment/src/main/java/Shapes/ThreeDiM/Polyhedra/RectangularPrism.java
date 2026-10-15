
package Shapes.ThreeDiM.Polyhedra;

import Shapes.ThreeDiM.Enums.ThreeDimCategory;

public class RectangularPrism extends Shapes.ThreeDiM.ThreeDimShape {

    private final double length;
    private final double width;
    private final double height;

    public RectangularPrism(double length, double width, double height) {
        if (!Double.isFinite(length) || length <= 0) {
            throw new IllegalArgumentException();
        }
        if (!Double.isFinite(width) || width <= 0) {
            throw new IllegalArgumentException();
        }
        if (!Double.isFinite(height) || height <= 0) {
            throw new IllegalArgumentException();
        }

        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public ThreeDimCategory getCategory() {
        return ThreeDimCategory.POLYHEDRON;
    }
}
