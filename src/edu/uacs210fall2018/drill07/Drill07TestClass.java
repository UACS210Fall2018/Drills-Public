package edu.uacs210fall2018.drill07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;


public class Drill07TestClass {
    @Test
    @GradedTest(name = "increase red, color=(.1, 0, 0)", max_score = 2)
    public void test_increase_red() {
        Color old = new Color(0, 0, 0, 0);
        Color c = Drill07.increaseRed(old);
        System.out.println("increaseRed(new Color(0, 0, 0)), got " + c);
        assertEquals(c.toString(), "0x1a000000");
    }

    @Test
    @GradedTest(name = "swap green and blue", max_score = 2)
    public void test_swap_green_blue() {
        Color old = new Color(.1, .2, .15, 0);
        Color c = Drill07.swapGreenBlue(old);
        System.out
                .println("swapGreenBlue(new Color(.1, .2, .15, 0)), got " + c);
        assertEquals(c.toString(), "0x1a263300");
    }

    @Test
    @GradedTest(name = "set fill color, color=(255, 0, 0)", max_score = 2)
    public void test_set_fill_color() {
        Canvas canvas = new Canvas(100, 200);
        Drill07.setFillColor(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Paint c = gc.getFill();

        Paint c2 = Color.rgb(255, 0, 0);

        System.out.println("setFillColor(canvas), got " + c);
        assertEquals(c, c2);
    }

    @Test
    @GradedTest(name = "set stroke color, color=(0, 255, 0)", max_score = 2)
    public void test_set_stroke_color() {
        Canvas canvas = new Canvas(100, 200);
        Drill07.setStrokeColor(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Paint c = gc.getStroke();

        Paint c2 = Color.rgb(0, 255, 0);

        System.out.println("setStrokeColor(canvas), got " + c);
        assertEquals(c, c2);
    }

    @Test
    @GradedTest(name = "draw oval", max_score = 2)
    public void draw_oval() {
        Canvas canvas = new Canvas(100, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Drill07.drawOval(canvas);
        
        System.out.println("drawOval got " + gc.getStroke());
        assertEquals(gc.getStroke(), new Color(0, 0, 1, 1));

    }
}
