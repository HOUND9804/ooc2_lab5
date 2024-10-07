package Test;

import Shapes.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTests {
    @Test
    void testSquareArea() {
        Square square = new Square(0, 0, 4);
        assertEquals(16, square.area());
    }

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 2);
        assertEquals(8, rectangle.area());
    }

    @Test
    void testCircleArea() {
        Circle circle = new Circle(0, 0, 3);
        assertEquals(Math.PI * 9, circle.area(), 0.001);
    }

    @Test
    void testOrderPrinter() {
        Shape[] shapes = {
                new Circle(0, 0, 1),
                new Square(1, 1, 1),
                new Rectangle(0, 1, 2, 1)
        };

        OrderPrinter printer = new OrderPrinter();
        for(Shape shape:shapes){
            printer.addShape(shape);
        }
        printer.printOrderedShapes();
    }

    @Test
    void testEqualAreas() {
        Shape[] shapes = {
                new Circle(0, 0, 1),
                new Square(1, 1, 1),
                new Rectangle(0, 2, 2, 0.5)
        };
        OrderPrinter printer = new OrderPrinter();
       for(Shape shape:shapes){
           printer.addShape(shape);
       }
    }

    @Test
    void testSortingByXPosition() {
        Shape[] shapes = {
                new Square(3, 0, 2),
                new Circle(1, 1, 1),
                new Rectangle(2, 2, 2, 2)
        };
        ArrayList<Shape>actualShapes = new ArrayList<>();
        actualShapes.add(new Circle(1, 1, 1));
        actualShapes.add( new Rectangle(2, 2, 2, 2));
        actualShapes.add(new Square(3, 0, 2));
        OrderPrinter printer = new OrderPrinter();
        for(Shape shape:shapes){
            printer.addShape(shape);
        }
        assertEquals(actualShapes,printer.getOrderedShapes());
    }

    @Test
    void testSortingByYPosition() {
        Shape[] shapes = {
                new Circle(1, 2, 1),
                new Rectangle(1, 0, 2, 2),
                new Square(1, 1, 1)
        };

        OrderPrinter printer = new OrderPrinter();
        for(Shape shape:shapes){
            printer.addShape(shape);
        }
    }

}
