package SelfAsm.SOLID;

import java.util.List;

public interface IAreaCalculator {

    /* Dependency Inversion:
    *  Components should depend on abstractions not on concretions*/
    int sum(List<Shape> shapes);
}
