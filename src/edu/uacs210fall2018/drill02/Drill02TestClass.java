package edu.uacs210fall2018.drill01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;


public class Drill01TestClass {

    @Test
    @GradedTest(name = "addOne test1, start at -1", max_score = 1)
    public void test_addOne_test1() {
        int x = Drill01.addOne(-1);
        System.out.println("addOne(-1), got " + x);
        assertEquals(x, 0);
    }

    @Test
    @GradedTest(name = "addOne test2, start at Integer.MAX_VALUE", max_score = 1)
    public void test_addOne_test2() {
        int x = Drill01.addOne(Integer.MAX_VALUE);
        System.out.println("addOne(Integer.MAX_VALUE), got " + x);
        assertEquals(x, Integer.MIN_VALUE);
    }

    @Test
    @GradedTest(name = "max test1, Integer.MAX_VALUE and 0", max_score = 1)
    public void test_max_test1() {
        int x = Drill01.max(Integer.MAX_VALUE, 0);
        System.out.println("max(Integer.MAX_VALUE,0), got " + x);
        assertEquals(x, Integer.MAX_VALUE);
    }

    @Test
    @GradedTest(name = "max test2, Integer.MIN_VALUE and -1", max_score = 1)
    public void test_max_test2() {
        int x = Drill01.max(Integer.MIN_VALUE, -1);
        System.out.println("max(Integer.MIN_VALUE, -1), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "sum2 test1, 3 and 4", max_score = 1)
    public void test_sum2_test1() {
        int x = Drill01.sum2(3, 4);
        System.out.println("sum2(3,4), got " + x);
        assertEquals(x, 7);
    }

    @Test
    @GradedTest(name = "sum2 test2, MAX_VALUE and MIN_VALUE", max_score = 1)
    public void test_sum2_test2() {
        int x = Drill01.sum2(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println("sum2(3,4), got " + x);
        assertEquals(x, 7);
    }

}
