package Shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    private final ArrayList<Shape> shapes;

    public OrderPrinter() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void printOrderedShapes() {
        List<Shape> orderedShapes = getOrderedShapes();
        for (Shape shape : orderedShapes) {
            System.out.println(shape);
        }
    }

    public List<Shape> getOrderedShapes() {
        ArrayList<Shape> sortedShapes = new ArrayList<>(shapes);
        sortedShapes.sort(Comparator.comparingDouble(Shape::area)
                .thenComparing(Shape::getx)
                .thenComparing(Shape::gety));
        return Collections.unmodifiableList(sortedShapes);
    }
}
