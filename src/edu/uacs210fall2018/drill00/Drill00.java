package edu.uacs210fall2018.drill00;

public class Drill00 {

    // Return the given value incremented by one.
    static int addOne(int val) {
        return val + 1;
    }

    // Return the maximum number between a and b.
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Return the sum of a and b.
    static int sum2(int a, int b) {
        return a + b;
    }

    // Return true if the input value is between 10 and 20, inclusive.
    static boolean range1(int a) {
        return (10 <= a && a <= 20);
    }

    // Return the absolute difference between two inputs.
    static int absDiff(int a, int b) {
        int diff = a - b;
        if (diff >= 0) {
            return diff;
        } else {
            return -diff;
        }
    }

}
