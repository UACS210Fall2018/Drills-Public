package edu.uacs210fall2018.drill01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Drill01 {

    // -------- Arrays
    // Construct and initialize an array with with size elements
    // and return the array. my_array[i] should hold the
    // value val*i.
    static int[] createArray(int size, int val) {
        int[] my_array = new int[size];

        // TODO: Write a loop that initializes the values in array.

        return my_array;
    }

    // -------- Lists
    // Return true if the given list contains the given value val
    // and return false otherwise.
    static boolean listContains(List<Integer> list, int val) {
        // TODO: implement listContains

        return false;
    }

    // -------- Sets
    // Return whether the given set contains the given value,
    // and return false otherwise.
    static boolean setContains(Set<Integer> set, int val) {
        // TODO: implement the contains method

        return false;
    }

    // -------- HashMaps

    // Given a list of categories (represented as string),
    // return a Map with the category being the key and
    // the number of times that category appears being the value.
    static Map<String, Integer> countCategories(List<String> list) {

        // TODO: Implement the countCategories method
        return new HashMap<>();
    }

    // Given a mapping of categories to a map of locations to
    // a count of how many of that category are at each location,
    // return the number of positions for the given location and
    // category. Return 0 if the given location and category
    // combination are not in the data.
    static int numPositions(Map<String, Map<String, Integer>> data,
            String category, String position) {

        // TODO: Implement the numPositions method

        return 0;
    }

}
