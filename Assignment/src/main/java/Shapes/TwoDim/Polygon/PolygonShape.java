package Shapes.TwoDim.Polygon;

import Shapes.TwoDim.TwoDimShape;
import Shapes.TwoDim.Enums.TwoDimCategory;

public abstract class PolygonShape extends TwoDimShape {

    @Override
    public final TwoDimCategory getCategory() {
        return TwoDimCategory.POLYGON;
    }
}