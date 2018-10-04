package edu.uacs210fall2018.drill05;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill05TestClass {

    @Test
    @GradedTest(name = "getShapeFromGrid test1", max_score = 1)
    public void testGetShapeFromGrid1() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();

        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));
        grid.get(0).add(new Triangle(5, 6));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Square(10));
        Shape theOne = new Triangle(7, 8);
        grid.get(1).add(theOne);

        Shape gotBack = Drill05.getShapeFromGrid(grid, 1, 1);

        System.out.println("gotBack = " + gotBack);
        assertEquals(theOne, gotBack);
    }

    @Test
    @GradedTest(name = "getShapeFromGrid test2", max_score = 1)
    public void testGetShapeFromGrid2() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();
        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Triangle(7, 8));

        grid.add(new ArrayList<Shape>());
        Shape theOne = new Square(10);
        grid.get(2).add(theOne);

        Shape gotBack = Drill05.getShapeFromGrid(grid, 2, 0);

        System.out.println("gotBack = " + gotBack);
        assertEquals(theOne, gotBack);
    }

    @Test
    @GradedTest(name = "isTriangle test1", max_score = 1)
    public void testIsTriangle1() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();

        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));
        grid.get(0).add(new Triangle(5, 6));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Square(10));
        Shape theOne = new Triangle(7, 8);
        grid.get(1).add(theOne);

        boolean gotBack = Drill05.isTriangle(grid, 1, 1);

        System.out.println(
                "isTriangle: theOne = " + theOne + ", gotBack = " + gotBack);
        assertEquals(theOne instanceof Triangle, gotBack);
    }

    @Test
    @GradedTest(name = "isTriangle test2", max_score = 1)
    public void testIsTriangle2() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();
        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Triangle(7, 8));

        grid.add(new ArrayList<Shape>());
        Shape theOne = new Square(10);
        grid.get(2).add(theOne);

        boolean gotBack = Drill05.isTriangle(grid, 2, 0);

        System.out.println(
                "isTriangle: theOne = " + theOne + ", gotBack = " + gotBack);
        assertEquals(theOne instanceof Triangle, gotBack);
    }

    @Test
    @GradedTest(name = "isSquare test1", max_score = 1)
    public void testIsSquare1() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();

        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));
        grid.get(0).add(new Triangle(5, 6));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Square(10));
        Shape theOne = new Triangle(7, 8);
        grid.get(1).add(theOne);

        boolean gotBack = Drill05.isSquare(grid, 1, 1);

        System.out.println(
                "isSquare: theOne = " + theOne + ", gotBack = " + gotBack);
        assertEquals(theOne instanceof Square, gotBack);
    }

    @Test
    @GradedTest(name = "isSquare test2", max_score = 1)
    public void testIsSquare2() {
        List<List<Shape>> grid = new ArrayList<List<Shape>>();
        grid.add(new ArrayList<Shape>());
        grid.get(0).add(new Triangle(3, 4));

        grid.add(new ArrayList<Shape>());
        grid.get(1).add(new Triangle(7, 8));

        grid.add(new ArrayList<Shape>());
        Shape theOne = new Square(10);
        grid.get(2).add(theOne);

        boolean gotBack = Drill05.isSquare(grid, 2, 0);

        System.out.println(
                "isSquare: theOne = " + theOne + ", gotBack = " + gotBack);
        assertEquals(theOne instanceof Square, gotBack);
    }

    @Test
    @GradedTest(name = "byRow test1", max_score = 1)
    public void testByRow1() {
        List<List<String>> grid = new ArrayList<List<String>>();
        grid.add(new ArrayList<String>());
        grid.get(0).add("hello ");
        grid.get(0).add("there!");

        grid.add(new ArrayList<String>());
        grid.get(1).add(null);
        grid.get(1).add(" How's it going?");

        String gotBack = Drill05.byRow(grid);
        String expected = "hello there! How's it going?";
        System.out.println(
                "byRow: expected = " + expected + ", gotBack = " + gotBack);
        assertEquals(expected, gotBack);
    }

    @Test
    @GradedTest(name = "byRow test2", max_score = 1)
    public void testByRow2() {
        List<List<String>> grid = new ArrayList<List<String>>();
        grid.add(new ArrayList<String>());
        grid.get(0).add("can ");
        grid.get(0).add("you");

        grid.add(null);

        grid.add(new ArrayList<String>());
        grid.get(2).add(" handle a null");
        grid.get(2).add(" row?");

        String gotBack = Drill05.byRow(grid);
        String expected = "can you handle a null row?";
        System.out.println(
                "byRow: expected = " + expected + ", gotBack = " + gotBack);
        assertEquals(expected, gotBack);
    }

    @Test
    @GradedTest(name = "setArrayElem test1", max_score = 1)
    public void testSetArrayElem1() {
        // initialize the screen
        char[][] screen = new char[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                screen[i][j] = '.';
            }
        }

        // test setArrayElem
        Drill05.setArrayElem(screen, 2, 3, 'H');
        char expected = 'H';
        char gotBack = screen[2][3];
        System.out.println("setArrayElem: expected = " + expected
                + ", gotBack = " + gotBack);
        assertEquals(expected, gotBack);
    }

    @Test
    @GradedTest(name = "setArrayElem test2", max_score = 1)
    public void testSetArrayElem2() {
        // initialize the screen
        char[][] screen = new char[5][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                screen[i][j] = '-';
            }
        }

        // test setArrayElem
        Drill05.setArrayElem(screen, 4, 2, 'v');
        char expected = 'v';
        char gotBack = screen[4][2];
        System.out.println("setArrayElem: expected = " + expected
                + ", gotBack = " + gotBack);
        assertEquals(expected, gotBack);
    }
}
