
package Shapes.ThreeDiM.NonPolyhedra;

import Shapes.ThreeDiM.Enums.ThreeDimCategory;

public class Cone extends Shapes.ThreeDiM.ThreeDimShape {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
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
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }

    @Override
    public ThreeDimCategory getCategory() {
        return ThreeDimCategory.NON_POLYHEDRON;
    }
}
