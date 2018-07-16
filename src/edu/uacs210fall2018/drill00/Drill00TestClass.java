package edu.uacs210fall2018.drill00;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill00TestClass {


    @Test
    @GradedTest(name = "addOne test1, start at -1", max_score = 1)
    public void test_addOne_test1() {
        int x = Drill00.addOne(-1);
        System.out.println("addOne(-1), got " + x);
        assertEquals(x, 0);
    }

    @Test
    @GradedTest(name = "addOne test2, start at -9999", max_score = 1)
    public void test_addOne_test2() {
        int x = Drill00.addOne(-9999);
        System.out.println("addOne(-9999), got " + x);
        assertEquals(x, -9998);
    }

    @Test
    @GradedTest(name = "addOne test3, start at Integer.MAX_VALUE", max_score = 1)
    public void test_addOne_test3() {
        int x = Drill00.addOne(Integer.MAX_VALUE);
        System.out.println("addOne(Integer.MAX_VALUE), got " + x);
        assertEquals(x, Integer.MIN_VALUE);
    }

    @Test
    @GradedTest(name = "subtractOne test1, start at Integer.MAX_VALUE", max_score = 1)
    public void test_subtractOne_test1() {
        int x = Drill00.subtractOne(Integer.MAX_VALUE);
        System.out.println("subtractOne(Integer.MAX_VALUE), got " + x);
        assertEquals(x, Integer.MAX_VALUE - 1);
    }

    @Test
    @GradedTest(name = "subtractOne test2, start at Integer.MIN_VALUE", max_score = 1)
    public void test_subtractOne_test2() {
        int x = Drill00.subtractOne(Integer.MIN_VALUE);
        System.out.println("subtractOne(Integer.MIN_VALUE), got " + x);
        assertEquals(x, Integer.MAX_VALUE);
    }

    @Test
    @GradedTest(name = "subtractOne test3, start at 0", max_score = 1)
    public void test_subtractOne_test3() {
        int x = Drill00.subtractOne(0);
        System.out.println("subtractOne(0), got " + x);
        assertEquals(x, -1);
    }

}
