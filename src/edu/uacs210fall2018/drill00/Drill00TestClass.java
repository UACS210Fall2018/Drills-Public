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
    @GradedTest(name = "max test1, Integer.MAX_VALUE and 0", max_score = 1)
    public void test_max_test1() {
        int x = Drill00.max(Integer.MAX_VALUE, 0);
        System.out.println("max(Integer.MAX_VALUE,0), got " + x);
        assertEquals(x, Integer.MAX_VALUE);
    }

    @Test
    @GradedTest(name = "max test2, Integer.MIN_VALUE and -1", max_score = 1)
    public void test_max_test2() {
        int x = Drill00.max(Integer.MIN_VALUE, -1);
        System.out.println("max(Integer.MIN_VALUE, -1), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "sum2 test1, 3 and 4", max_score = 1)
    public void test_sum2_test1() {
        int x = Drill00.sum2(3, 4);
        System.out.println("sum2(3,4), got " + x);
        assertEquals(x, 7);
    }

    @Test
    @GradedTest(name = "sum2 test2, MAX_VALUE and MIN_VALUE", max_score = 1)
    public void test_sum2_test2() {
        int x = Drill00.sum2(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println(
                "sum2(Integer.MAX_VALUE, Integer.MIN_VALUE), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "range1 test1, 20", max_score = 1)
    public void test_range1_test1() {
        boolean x = Drill00.range1(20);
        System.out.println("range1(20), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "range1 test2, 21", max_score = 1)
    public void test_range1_test2() {
        boolean x = Drill00.range1(21);
        System.out.println("range1(21), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "range1 test3, 9", max_score = 1)
    public void test_range1_test3() {
        boolean x = Drill00.range1(9);
        System.out.println("range1(9), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "absDiff test1, 6 3", max_score = 1)
    public void test_absDiff_test1() {
        int x = Drill00.absDiff(6, 3);
        System.out.println("absDiff(6,3), got " + x);
        assertEquals(x, 3);
    }

    @Test
    @GradedTest(name = "absDiff test2, 3 6", max_score = 1)
    public void test_absDiff_test2() {
        int x = Drill00.absDiff(3, 6);
        System.out.println("absDiff(3,6), got " + x);
        assertEquals(x, 3);
    }

}
