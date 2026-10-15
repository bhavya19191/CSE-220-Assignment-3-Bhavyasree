
package Shapes.ThreeDiM.NonPolyhedra;

import Shapes.ThreeDiM.Enums.ThreeDimCategory;

public class Sphere extends Shapes.ThreeDiM.ThreeDimShape {

    private final double radius;

    public Sphere(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException();
        }

        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public ThreeDimCategory getCategory() {
        return ThreeDimCategory.NON_POLYHEDRON;
    }
}
