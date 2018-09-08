package edu.uacs210fall2018.drill01;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill01TestClass {

    @Test
    @GradedTest(name = "createArray test1, size=1, val=42", max_score = 1)
    public void test_createArray_test1() {
        int[] x = Drill01.createArray(1, 42);
        System.out.println(
                "createArray(1,42), got " + java.util.Arrays.toString(x));
        int[] expected = new int[] { 0 };
        assertEquals(java.util.Arrays.toString(x),
                java.util.Arrays.toString(expected));
    }

    @Test
    @GradedTest(name = "createArray test2, size=7, val=3", max_score = 1)
    public void test_createArray_test2() {
        int[] x = Drill01.createArray(7, 3);
        System.out.println(
                "createArray(7,3), got " + java.util.Arrays.toString(x));
        int[] expected = new int[] { 0, 3, 6, 9, 12, 15, 18 };
        assertEquals(java.util.Arrays.toString(x),
                java.util.Arrays.toString(expected));
    }

    @Test
    @GradedTest(name = "listContains test1, [3,2,1], 0", max_score = 1)
    public void test_listContains_test1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1));
        boolean x = Drill01.listContains(list, 0);
        System.out.println("listContains([3,2,1], 0), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "listContains test2, [0,3,2,1,7,42], 42", max_score = 1)
    public void test_listContains_test2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 3, 2, 1, 7, 42));
        boolean x = Drill01.listContains(list, 42);
        System.out.println("listContains([0,3,2,1,7,42], 42), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "setContains test1, [3,2,1,3], 0", max_score = 1)
    public void test_setContains_test1() {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 2, 1, 3));
        boolean x = Drill01.setContains(set, 0);
        System.out.println("setContains([3,2,1,3], 0), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "setContains test2, [0,3,42,1,7,42], 42", max_score = 1)
    public void test_setContains_test2() {
        Set<Integer> set = new HashSet<>(Arrays.asList(0, 3, 42, 1, 7, 42));
        boolean x = Drill01.setContains(set, 42);
        System.out.println("setContains([0,3,42,1,7,42], 42), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "countCategories test1, "
            + "[\"Teacher\",\"Engineer\",\"Teacher\"]", max_score = 1)
    public void test_countCategories_test1() {
        List<String> list = new ArrayList<>(
                Arrays.asList("Teacher", "Engineer", "Teacher"));
        Map<String, Integer> map = Drill01.countCategories(list);
        System.out.println("countCategories("
                + "[\"Teacher\",\"Engineer\",\"Teacher\"])," + "got " + map);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Teacher", 2);
        expected.put("Engineer", 1);
        assertEquals(map.toString(), expected.toString());
    }

    @Test
    @GradedTest(name = "countCategories test2, "
            + "[\"Nurse\", \"MD\", \"MD\",\"PhD\",\"MD\"]", max_score = 1)
    public void test_countCategories_test2() {
        List<String> list = new ArrayList<>(
                Arrays.asList("Nurse", "MD", "MD", "PhD", "MD"));
        Map<String, Integer> map = Drill01.countCategories(list);
        System.out.println("countCategories("
                + "[\"Nurse\", \"MD\", \"MD\", \"PhD\", \"MD\"])," + "got "
                + map);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Nurse", 1);
        expected.put("MD", 3);
        expected.put("PhD", 1);
        assertEquals(map.toString(), expected.toString());
    }

    @Test
    @GradedTest(name = "numPositions test1, "
            + "{PhD: {CA: 30, PA: 20, AZ:10}, MD: {OH: 100, HI: 2}}", max_score = 1)
    public void test_numPositions_test1() {
        Map<String, Map<String, Integer>> nested_map = new HashMap<>();
        nested_map.put("PhD", new HashMap<>());
        nested_map.get("PhD").put("CA", 30);
        nested_map.get("PhD").put("PA", 20);
        nested_map.get("PhD").put("AZ", 10);
        nested_map.put("MD", new HashMap<>());
        nested_map.get("MD").put("OH", 100);
        nested_map.get("MD").put("HI", 2);
        int count = Drill01.numPositions(nested_map, "PhD", "AZ");
        System.out.println("numPositions("
                + "{PhD: {CA: 30, PA: 20, AZ:10}, MD: {OH: 100, HI: 2}},"
                + "PhD, AZ) got " + count);
        assertEquals(count, 10);
    }

    @Test
    @GradedTest(name = "numPositions test2, "
            + "{PhD: {CA: 30, PA: 20, AZ:10}, MD: {OH: 100, HI: 2}}", max_score = 1)
    public void test_numPositions_test2() {
        Map<String, Map<String, Integer>> nested_map = new HashMap<>();
        nested_map.put("PhD", new HashMap<>());
        nested_map.get("PhD").put("CA", 30);
        nested_map.get("PhD").put("PA", 20);
        nested_map.get("PhD").put("AZ", 10);
        nested_map.put("MD", new HashMap<>());
        nested_map.get("MD").put("OH", 100);
        nested_map.get("MD").put("HI", 2);
        int count = Drill01.numPositions(nested_map, "OH", "MD");
        System.out.println("numPositions("
                + "{PhD: {CA: 30, PA: 20, AZ:10}, MD: {OH: 100, HI: 2}},"
                + "OH, MD) got " + count);
        assertEquals(count, 0);
    }

}
