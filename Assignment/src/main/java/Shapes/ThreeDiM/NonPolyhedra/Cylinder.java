
package Shapes.ThreeDiM.NonPolyhedra;

import Shapes.ThreeDiM.Enums.ThreeDimCategory;

public class Cylinder extends Shapes.ThreeDiM.ThreeDimShape {

    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException();
        }
        if (!Double.isFinite(height) || height <= 0) {
            throw new IllegalArgumentException();
        }

        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public ThreeDimCategory getCategory() {
        return ThreeDimCategory.NON_POLYHEDRON;
    }
}
