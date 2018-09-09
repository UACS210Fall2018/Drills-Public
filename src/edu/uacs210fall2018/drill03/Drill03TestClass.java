package edu.uacs210fall2018.drill03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill03TestClass {
    public final double epsilon = 0.00000001;

    @Test
    @GradedTest(name = "Shape toString test", max_score = 1)
    public void testShapeToStringTest() {
        Shape shape = new Shape();
        System.out.println("shape.toString(), got " + shape.toString());
        assertEquals(shape.toString(), "Shape base class");
    }

    @Test
    @GradedTest(name = "Shape add areas", max_score = 1)
    public void testShapeAddAreasTest1() {
        Shape shape1 = new Triangle(3, 4);
        Shape shape2 = new Square(42);
        double result = shape1.area() + shape2.area();
        System.out.println("adding areas, got " + result);
        double expected = 1770;
        assertTrue((expected - epsilon) <= result
                && result <= (expected + epsilon));
    }

    @Test
    @GradedTest(name = "square area test1, size=5", max_score = 1)
    public void testSquareAreaTest1() {
        Shape shape = new Square(5);
        System.out.println("shape.area(), got " + shape.area());
        double expected = 25;
        assertTrue((expected - epsilon) <= shape.area()
                && shape.area() <= (expected + epsilon));
    }

    @Test
    @GradedTest(name = "square area test2, size=5.5", max_score = 1)
    public void testSquareAreaTest2() {
        Shape shape = new Square(5.5);
        System.out.println("shape.area(), got " + shape.area());
        double expected = 30.25;
        assertTrue((expected - epsilon) <= shape.area()
                && shape.area() <= (expected + epsilon));
    }

    @Test
    @GradedTest(name = "square toString test1, size=5.5", max_score = 1)
    public void testSquareToStringTest1() {
        Shape shape = new Square(5.5);
        System.out.println("shape.toString(), got " + shape.toString());
        assertEquals(shape.toString(), "Square(size = 5.5)");
    }

    @Test
    @GradedTest(name = "square toString test2, size=3", max_score = 1)
    public void testSquareToStringTest2() {
        Square shape = new Square(3);
        System.out.println("shape.toString(), got " + shape.toString());
        assertEquals(shape.toString(), "Square(size = 3.0)");
    }

    @Test
    @GradedTest(name = "Triangle(1,4) area test1", max_score = 1)
    public void testTriangleAreaTest1() {
        Shape shape = new Triangle(1, 4);
        System.out.println("shape.area(), got " + shape.area());
        double expected = .5 * 1 * 4;
        assertTrue((expected - epsilon) <= shape.area()
                && shape.area() <= (expected + epsilon));
    }

    @Test
    @GradedTest(name = "Triangle(1.9,10) area test2", max_score = 1)
    public void testTriangleAreaTest2() {
        Triangle shape = new Triangle(1.9, 10);
        System.out.println("shape.area(), got " + shape.area());
        double expected = .5 * 1.9 * 10;
        assertTrue((expected - epsilon) <= shape.area()
                && shape.area() <= (expected + epsilon));
    }

    @Test
    @GradedTest(name = "Triangle(3,2) toString test1", max_score = 1)
    public void testTriangleToStringTest1() {
        Shape shape = new Triangle(3, 2);
        System.out.println("shape.toString(), got " + shape.toString());
        assertEquals(shape.toString(), "Triangle(base = 3.0, height = 2.0)");
    }

    @Test
    @GradedTest(name = "Triangle(6.7,2.3) toString test2", max_score = 1)
    public void testTriangleToStringTest2() {
        Triangle shape = new Triangle(6.7, 2.3);
        System.out.println("shape.toString(), got " + shape.toString());
        assertEquals(shape.toString(), "Triangle(base = 6.7, height = 2.3)");
    }

}
