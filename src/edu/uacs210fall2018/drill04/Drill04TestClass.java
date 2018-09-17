package edu.uacs210fall2018.drill04;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.TreeMap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill04TestClass {

    @Test
    @GradedTest(name = "split wrapper test1", max_score = 1)
    public void testSplitWrapper1() {
        List<String> fields = Drill04.splitWrapper("ab,c,,d");
        System.out.println("fields.get(3) = " + fields.get(3));
        assertEquals("d", fields.get(3));
    }

    @Test
    @GradedTest(name = "split wrapper test2", max_score = 1)
    public void testSplitWrapper2() {
        List<String> fields = Drill04.splitWrapper("ab,c,,,");
        System.out.println("fields.size() = " + fields.size());
        assertEquals(5, fields.size());
    }

    @Test
    @GradedTest(name = "enum2string test1, cat", max_score = 1)
    public void enum2stringtest1() {
        Drill04.Pet mypet = Drill04.Pet.CAT;
        System.out.println(
                "Drill04.enum2string(mypet) = " + Drill04.enum2string(mypet));
        assertEquals("CAT", Drill04.enum2string(mypet));
    }

    @Test
    @GradedTest(name = "enum2string test2, tarantula", max_score = 1)
    public void enum2stringtest2() {
        Drill04.Pet mypet = Drill04.Pet.TARANTULA;
        System.out.println(
                "Drill04.enum2string(mypet) = " + Drill04.enum2string(mypet));
        assertEquals("TARANTULA", Drill04.enum2string(mypet));
    }

    @Test
    @GradedTest(name = "getLexeme test 1", max_score = 1)
    public void getLexemeTest1() {
        String field = Drill04.getLexeme("a NAND (b NAND $t) NAND _3", 1);
        System.out
                .println("getLexeme(a NAND (b NAND $t) NAND _3,1) = " + field);
        assertEquals("NAND", field);
    }

    @Test
    @GradedTest(name = "getLexeme test 2", max_score = 1)
    public void getLexemeTest2() {
        String field = Drill04.getLexeme("a NAND (b NAND $t) NAND _3", 6);
        System.out
                .println("getLexeme(a NAND (b NAND $t) NAND _3,6) = " + field);
        assertEquals("PAREN_RIGHT", field);
    }

    @Test
    @GradedTest(name = "sumTree test 1", max_score = 1)
    public void sumTreeTest1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(4, null, null),
                        new TreeNode(7, null, null)),
                new TreeNode(5, new TreeNode(4, null, null),
                        new TreeNode(7, null, null)));
        System.out.println("root = " + root);
        int sum = Drill04.sumTree(root);
        System.out.println("sumTree(root) = " + sum);
        assertEquals(35, sum);
    }

    @Test
    @GradedTest(name = "sumTree test 2", max_score = 1)
    public void sumTreeTest2() {
        TreeNode root = new TreeNode(42, null, new TreeNode(7, null, null));
        System.out.println("root = " + root);
        int sum = Drill04.sumTree(root);
        System.out.println("sumTree(root) = " + sum);
        assertEquals(49, sum);
    }

    @Test
    @GradedTest(name = "createConfigStr test 1", max_score = 1)
    public void createConfigStrTest1() {
        TreeMap<String, Boolean> map = new TreeMap<>();
        map.put("b", false);
        map.put("a", true);
        System.out.println("test1: createConfigStr(map) = "
                + Drill04.createConfigStr(map));
        assertEquals("a: true, b: false", Drill04.createConfigStr(map));
    }

    @Test
    @GradedTest(name = "createConfigStr test 2", max_score = 1)
    public void createConfigStrTest2() {
        TreeMap<String, Boolean> map = new TreeMap<>();
        map.put("ba_sdf", false);
        map.put("a", true);
        map.put("$id", true);
        System.out.println("test2: createConfigStr(map) = "
                + Drill04.createConfigStr(map));
        assertEquals("$id: true, a: true, ba_sdf: false",
                Drill04.createConfigStr(map));
    }

}
