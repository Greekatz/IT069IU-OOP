package SelfAsm.SOLID;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();

            }
        return sum;
    }


}
