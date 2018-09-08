package edu.uacs210fall2018.drill02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;


public class Drill02TestClass {

    @Test
    @GradedTest(name = "zigzag test1, n=1", max_score = 1)
    public void test_zigzag_test1() {
        String x = Drill02.zigzag(1);
        System.out.println("zigzag(1), got " + x);
        assertEquals(x, "*");
    }

    @Test
    @GradedTest(name = "zigzag test2, n=2", max_score = 1)
    public void test_zigzag_test2() {
        String x = Drill02.zigzag(2);
        System.out.println("zigzag(2), got " + x);
        assertEquals(x, "**");
    }

    @Test
    @GradedTest(name = "zigzag test3, n=3", max_score = 1)
    public void test_zigzag_test3() {
        String x = Drill02.zigzag(3);
        System.out.println("zigzag(3), got " + x);
        assertEquals(x, "<*>");
    }

    @Test
    @GradedTest(name = "zigzag test4, n=4", max_score = 1)
    public void test_zigzag_test4() {
        String x = Drill02.zigzag(4);
        System.out.println("zigzag(4), got " + x);
        assertEquals(x, "<**>");
    }

    @Test
    @GradedTest(name = "zigzag test5, n=5", max_score = 1)
    public void test_zigzag_test5() {
        String x = Drill02.zigzag(5);
        System.out.println("zigzag(5), got " + x);
        assertEquals(x, "<<*>>");
    }

    @Test
    @GradedTest(name = "zigzag test6, n=6", max_score = 1)
    public void test_zigzag_test6() {
        String x = Drill02.zigzag(6);
        System.out.println("zigzag(6), got " + x);
        assertEquals(x, "<<**>>");
    }

    @Test
    @GradedTest(name = "zigzag test7, n=7", max_score = 1)
    public void test_zigzag_test7() {
        String x = Drill02.zigzag(7);
        System.out.println("zigzag(7), got " + x);
        assertEquals(x, "<<<*>>>");
    }

    @Test
    @GradedTest(name = "zigzag test8, n=8", max_score = 1)
    public void test_zigzag_test8() {
        String x = Drill02.zigzag(8);
        System.out.println("zigzag(8), got " + x);
        assertEquals(x, "<<<**>>>");
    }

    @Test
    @GradedTest(name = "zigzag test9, n=9", max_score = 1)
    public void test_zigzag_test9() {
        String x = Drill02.zigzag(9);
        System.out.println("zigzag(9), got " + x);
        assertEquals(x, "<<<<*>>>>");
    }

    @Test
    @GradedTest(name = "zigzag test10, n=10", max_score = 1)
    public void test_zigzag_test10() {
        String x = Drill02.zigzag(10);
        System.out.println("zigzag(10), got " + x);
        assertEquals(x, "<<<<**>>>>");
    }

    @Test
    @GradedTest(name = "moveToEnd test1, s=hello, c=l", max_score = 1)
    public void test_moveToEnd_test1() {
        String x = Drill02.moveToEnd("hello", 'l');
        System.out.println("moveToEnd(hello,l), got " + x);
        assertEquals(x, "heoLL");
    }

    @Test
    @GradedTest(name = "moveToEnd test2, s=hello, c=e", max_score = 1)
    public void test_moveToEnd_test2() {
        String x = Drill02.moveToEnd("hello", 'e');
        System.out.println("moveToEnd(hello,e), got " + x);
        assertEquals(x, "hlloE");
    }

    @Test
    @GradedTest(name = "moveToEnd test3, s=hello there, c=e", max_score = 1)
    public void test_moveToEnd_test3() {
        String x = Drill02.moveToEnd("hello there", 'e');
        System.out.println("moveToEnd(hello there,e), got " + x);
        assertEquals(x, "hllo thrEEE");
    }

    @Test
    @GradedTest(name = "moveToEnd test4, s=hello there, c=q", max_score = 1)
    public void test_moveToEnd_test4() {
        String x = Drill02.moveToEnd("hello there", 'q');
        System.out.println("moveToEnd(hello there,q), got " + x);
        assertEquals(x, "hello there");
    }

    @Test
    @GradedTest(name = "moveToEnd test5, s=HELLO there, c=e", max_score = 1)
    public void test_moveToEnd_test5() {
        String x = Drill02.moveToEnd("HELLO there", 'e');
        System.out.println(
                "moveToEnd(HELLO there,e), got " + x);
        assertEquals(x, "HLLO thrEEE");
    }

    @Test
    @GradedTest(name = "moveToEnd test6, s=HHH, c=H", max_score = 1)
    public void test_moveToEnd_test6() {
        String x = Drill02.moveToEnd("HHH", 'H');
        System.out.println(
                "moveToEnd(HHH,H), got " + x);
        assertEquals(x,"HHH");
    }

    @Test
    @GradedTest(name = "moveToEnd test7, s=hahahaha, c=h", max_score = 1)
    public void test_moveToEnd_test7() {
        String x = Drill02.moveToEnd("hahahaha", 'h');
        System.out.println(
                "moveToEnd(hahahaha,h), got " + x);
        assertEquals(x, "aaaaHHHH");
    }

    @Test
    @GradedTest(name = "indexOf test1, s1=abc, s2=a", max_score = 1)
    public void test_indexOf_test1() {
        int x = Drill02.indexOf("abc", "a");
        System.out.println("indexOf(abc,a), got " + x);
        assertEquals(x, 0);
    }

    @Test
    @GradedTest(name = "indexOf test2, s1=abc, s2=b", max_score = 1)
    public void test_indexOf_test2() {
        int x = Drill02.indexOf("abc", "b");
        System.out.println("indexOf(abc,b), got " + x);
        assertEquals(x, 1);
    }

    @Test
    @GradedTest(name = "indexOf test3, s1=abc, s2=c", max_score = 1)
    public void test_indexOf_test3() {
        int x = Drill02.indexOf("abc", "c");
        System.out.println("indexOf(abc,c), got " + x);
        assertEquals(x, 2);
    }

    @Test
    @GradedTest(name = "indexOf test4, s1=abc, s2=d", max_score = 1)
    public void test_indexOf_test4() {
        int x = Drill02.indexOf("abc", "d");
        System.out.println("indexOf(abc,d), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "indexOf test5, s1=Barack Obama, s2=Bar", max_score = 1)
    public void test_indexOf_test5() {
        int x = Drill02.indexOf("Barack Obama", "Bar");
        System.out.println("indexOf(Barack Obama,Bar), got " + x);
        assertEquals(x, 0);
    }

    @Test
    @GradedTest(name = "indexOf test6, s1=Barack Obama, s2=ck", max_score = 1)
    public void test_indexOf_test6() {
        int x = Drill02.indexOf("Barack Obama", "ck");
        System.out.println("indexOf(Barack Obama,ck), got " + x);
        assertEquals(x, 4);
    }

    @Test
    @GradedTest(name = "indexOf test7, s1=Barack Obama, s2=a", max_score = 1)
    public void test_indexOf_test7() {
        int x = Drill02.indexOf("Barack Obama", "a");
        System.out.println("indexOf(Barack Obama,a), got " + x);
        assertEquals(x, 1);
    }

    @Test
    @GradedTest(name = "indexOf test8, s1=Barack Obama, s2=McCain", max_score = 1)
    public void test_indexOf_test8() {
        int x = Drill02.indexOf("Barack Obama", "McCain");
        System.out.println("indexOf(Barack Obama,McCain), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "indexOf test9, s1=Barack Obama, s2=BAR", max_score = 1)
    public void test_indexOf_test9() {
        int x = Drill02.indexOf("Barack Obama", "BAR");
        System.out.println("indexOf(Barack Obama,BAR), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "indexOf test10, s1=Barack Obama, s2=Barabara Obaoba", max_score = 1)
    public void test_indexOf_test10() {
        int x = Drill02.indexOf("Barack Obama", "Barabara Obaoba");
        System.out.println("indexOf(Barack Obama,Barabara Obaoba), got " + x);
        assertEquals(x, -1);
    }

    @Test
    @GradedTest(name = "replaceAll test1, s1=Merlin, c1=e, c2=a", max_score = 1)
    public void test_replaceAll_test1() {
        String x = Drill02.replaceAll("Merlin", 'e', 'a');
        System.out.println("indexOf(Merlin,e,a), got " + x);
        assertEquals(x, "Marlin");
    }

    @Test
    @GradedTest(name = "replaceAll test2, s1=Merlin, c1=q, c2=a", max_score = 1)
    public void test_replaceAll_test2() {
        String x = Drill02.replaceAll("Merlin", 'q', 'a');
        System.out.println("indexOf(Merlin,q,a), got " + x);
        assertEquals(x, "Merlin");
    }

    @Test
    @GradedTest(name = "replaceAll test3, s1=Purrcy, c1=r, c2=a", max_score = 1)
    public void test_replaceAll_test3() {
        String x = Drill02.replaceAll("Purrcy", 'r', 'a');
        System.out.println("indexOf(Purrcy,r,a), got " + x);
        assertEquals(x, "Puaacy");
    }

    @Test
    @GradedTest(name = "replaceAll test4, s1=Chester, c1=e, c2=m", max_score = 1)
    public void test_replaceAll_test4() {
        String x = Drill02.replaceAll("Chester", 'e', 'm');
        System.out.println("indexOf(Chester,e,m), got " + x);
        assertEquals(x, "Chmstmr");
    }

    @Test
    @GradedTest(name = "replaceAll test5, s1=ChEster, c1=e, c2=m", max_score = 1)
    public void test_replaceAll_test5() {
        String x = Drill02.replaceAll("ChEster", 'e', 'm');
        System.out.println("indexOf(ChEster,e,m), got " + x);
        assertEquals(x, "ChEstmr");
    }

    @Test
    @GradedTest(name = "digitsSorted test1, x=0", max_score = 1)
    public void test_digitsSorted_test1() {
        boolean x = Drill02.digitsSorted(0);
        System.out.println("digitsSorted(0), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "digitsSorted test2, x=234", max_score = 1)
    public void test_digitsSorted_test2() {
        boolean x = Drill02.digitsSorted(234);
        System.out.println("digitsSorted(234), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "digitsSorted test3, x=-2345", max_score = 1)
    public void test_digitsSorted_test3() {
        boolean x = Drill02.digitsSorted(-2345);
        System.out.println("digitsSorted(-2345), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "digitsSorted test4, x=22334455", max_score = 1)
    public void test_digitsSorted_test4() {
        boolean x = Drill02.digitsSorted(22334455);
        System.out.println("digitsSorted(22334455), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "digitsSorted test5, x=-5", max_score = 1)
    public void test_digitsSorted_test5() {
        boolean x = Drill02.digitsSorted(-5);
        System.out.println("digitsSorted(-5), got " + x);
        assertEquals(x, true);
    }

    @Test
    @GradedTest(name = "digitsSorted test6, x=4321", max_score = 1)
    public void test_digitsSorted_test6() {
        boolean x = Drill02.digitsSorted(4321);
        System.out.println("digitsSorted(4321), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "digitsSorted test7, x=24378", max_score = 1)
    public void test_digitsSorted_test7() {
        boolean x = Drill02.digitsSorted(24378);
        System.out.println("digitsSorted(24378), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "digitsSorted test8, x=21", max_score = 1)
    public void test_digitsSorted_test8() {
        boolean x = Drill02.digitsSorted(21);
        System.out.println("digitsSorted(21), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "digitsSorted test9, x=-33331", max_score = 1)
    public void test_digitsSorted_test9() {
        boolean x = Drill02.digitsSorted(-33331);
        System.out.println("digitsSorted(-33331), got " + x);
        assertEquals(x, false);
    }

    @Test
    @GradedTest(name = "digitsSorted test5, x=-1233331", max_score = 1)
    public void test_digitsSorted_test10() {
        boolean x = Drill02.digitsSorted(-1233331);
        System.out.println("digitsSorted(-1233331), got " + x);
        assertEquals(x, false);
    }
}
