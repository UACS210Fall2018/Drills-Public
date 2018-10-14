package edu.uacs210fall2018.drill06;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.gradescope.jh61b.grader.GradedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill06TestClass {

    @Test
    @GradedTest(name = "returnValue test1", max_score = 1)
    public void testReturnValue1() {
        HashNode<String, Integer> node = new HashNode<>("hello", 42);

        int expected = 42;
        int val = Drill06.<String, Integer>returnValue(node);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "returnValue test2", max_score = 1)
    public void testReturnValue2() {
        HashNode<Integer, String> node = new HashNode<>(42, "hello");

        String expected = "hello";
        String val = Drill06.<Integer, String>returnValue(node);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "returnKey test1", max_score = 1)
    public void testReturnKey1() {
        HashNode<String, Integer> node = new HashNode<>("hello", 42);

        String expected = "hello";
        String val = Drill06.<String, Integer>returnKey(node);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "returnKey test2", max_score = 1)
    public void testReturnKey2() {
        HashNode<Integer, String> node = new HashNode<>(42, "hello");

        int expected = 42;
        int val = Drill06.<Integer, String>returnKey(node);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "findLastVal test1", max_score = 1)
    public void testFindLastVal1() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        node1.setNext(node2);
        node2.setNext(node3);

        int expected = 21;
        int val = Drill06.<String, Integer>findLastVal(node1);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "findLastVal test2", max_score = 1)
    public void testFindLastVal2() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(new HashNode<>("last", 99));

        int expected = 99;
        int val = Drill06.<String, Integer>findLastVal(node1);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "findNodeByIndex test1", max_score = 1)
    public void testFindNodeByIndex1() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        node1.setNext(node2);
        node2.setNext(node3);

        int expected = 7;
        HashNode<String, Integer> node = Drill06
                .<String, Integer>findNodeByIndex(node1, 1);
        int val = node.getValue();

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "findNodeByIndex test2", max_score = 1)
    public void testFindNodeByIndex2() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        node1.setNext(node2);
        node2.setNext(node3);

        int expected = 42;
        HashNode<String, Integer> node = Drill06
                .<String, Integer>findNodeByIndex(node1, 0);
        int val = node.getValue();

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "countNodes test1", max_score = 1)
    public void testCountNodes1() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        HashNode<String, Integer> node4 = new HashNode<>("another", 1);
        HashNode<String, Integer> node5 = new HashNode<>("key", 99);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        int expected = 3;
        int val = Drill06.<String, Integer>countNodes(node3);

        assertEquals(expected, val);
    }

    @Test
    @GradedTest(name = "countNodes test2", max_score = 1)
    public void testCountNodes2() {
        HashNode<String, Integer> node1 = new HashNode<>("hello", 42);
        HashNode<String, Integer> node2 = new HashNode<>("bye", 7);
        HashNode<String, Integer> node3 = new HashNode<>("good", 21);
        HashNode<String, Integer> node4 = new HashNode<>("another", 1);
        HashNode<String, Integer> node5 = new HashNode<>("key", 99);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        int expected = 0;
        int val = Drill06.<String, Integer>countNodes(null);

        assertEquals(expected, val);
    }

}
