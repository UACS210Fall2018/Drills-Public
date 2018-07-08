package edu.uacs210fall2018.drillexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;



public class DrillExampleTestClass {

    @Test
    @GradedTest(name="addOne test1, start at -1", max_score=1)
    public void test_addOne_test1() {
        int x = DrillExample.addOne(-1);
        System.out.println("addOne(-1), got " + x);
        assertEquals(x, 0);
    }

    
    @Test
    @GradedTest(name="Test 1+1", max_score=1)
    public void test_1p1() {
        int x = 1 + 1;
        System.out.println("Tested 1+1, got " + x);
        assertEquals(x, 2);
    }

    @Test
    @GradedTest(name="Test 1+1*2", max_score=1, visibility="after_published")
    public void test_1p1t2() {
        int x = 1 + 1 * 2;
        System.out.println("Tested 1+1*2, got " + x);
        assertEquals(x, 3);
    }
    // Add more tests...
}
