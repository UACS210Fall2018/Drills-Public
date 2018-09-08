package edu.uacs210fall2018.drill03;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;


public class Drill03TestClass {
    public final double epsilon = 0.00000001;

    @Test
    @GradedTest(name = "square test1, size=5", max_score = 1)
    public void test_square_test1() {
        Shape shape = new Square(5);
        System.out.println("shape.area(), got " + shape.area());
        double expected = 25;
        assertTrue((expected - epsilon) <= shape.area()
                && shape.area() <= (expected + epsilon));
    }

}
