package SelfAsm.SOLID;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    /* Each class should have only one sole purpose,
    * and not be filled with excessive functionality*/
    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
