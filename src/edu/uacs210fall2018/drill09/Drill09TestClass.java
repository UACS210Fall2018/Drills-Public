package edu.uacs210fall2018.drill09;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill09TestClass {

    @Test
    @GradedTest(name = "addTwo test1", max_score = 1)
    public void testAddTwo1() {
        int expected = 42;
        Int2IntFunction f = Drill09.returnAddTwoLambda();

        int val = f.compute(40);
        System.out.println("addTwo test 1: f.compute(40) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "addTwo test2", max_score = 1)
    public void testAddTwo2() {
        int expected = -3;
        Int2IntFunction f = Drill09.returnAddTwoLambda();

        int val = f.compute(-5);
        System.out.println("addTwo test 2: f.compute(-5) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "addTwo test3", max_score = 1)
    public void testAddTwo3() {
        int expected = 2;
        Int2IntFunction f = Drill09.returnAddTwoLambda();

        int val = f.compute(0);
        System.out.println("addTwo test 3: f.compute(0) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "concatToHello test1", max_score = 1)
    public void testConcatHello1() {
        String expected = "hello there";
        Str2StrFunction f = Drill09.returnConcatToHelloLambda();

        String val = f.compute(" there");
        System.out.println(
                "concatToHello test 1: f.compute(\" there\") = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "concatToHello test2", max_score = 1)
    public void testConcatToHello2() {
        String expected = "hellonull";
        Str2StrFunction f = Drill09.returnConcatToHelloLambda();

        String val = f.compute(null);
        System.out.println("concatToHello test 2: f.compute(null) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "avgWithThree test1", max_score = 1)
    public void testAvgWithThree1() {
        int expected = 2;
        Int2IntFunction f = Drill09.returnAvgWithThreeLambda();

        int val = f.compute(1);
        System.out.println("returnAvgWithThree test 1: f.compute(1) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "avgWithThree test2", max_score = 1)
    public void testAvgWithThree2() {
        int expected = 0;
        Int2IntFunction f = Drill09.returnAvgWithThreeLambda();

        int val = f.compute(-3);
        System.out.println("returnAvgWithThree test 2: f.compute(-3) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "avgWithThree test3", max_score = 1)
    public void testAvgWithThree3() {
        int expected = 6;
        Int2IntFunction f = Drill09.returnAvgWithThreeLambda();

        int val = f.compute(10);
        System.out.println("returnAvgWithThree test 3: f.compute(10) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "concatWith1n2List test1", max_score = 1)
    public void testConcatWith1n2List1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(42);
        List2ListFunction f = Drill09.returnConcatWith1n2ListLambda();

        List<Integer> aList = new LinkedList<>();
        aList.add(42);
        List<Integer> val = f.foo(aList);
        System.out.println("concatWith1n2 test 1: f.compute([42]) = " + val);
        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "concatWith1n2List test2", max_score = 1)
    public void testConcatWith1n2List2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List2ListFunction f = Drill09.returnConcatWith1n2ListLambda();

        List<Integer> val = f.foo(new LinkedList<>());
        System.out.println("concatWith1n2 test 2: f.compute([]) = " + val);
        assertEquals(expected, val);
    }

}
