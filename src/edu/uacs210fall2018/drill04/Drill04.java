package edu.uacs210fall2018.drill04;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import bool_exp.Lexer;


public class Drill04 {
    public enum Pet {
        CAT, DOG, PARROT, LIZARD, TARANTULA, IGUANA, HAMSTER, FISH
    }

    // Separate fields by commas. Have empty strings if there is nothing between
    // commas or after last comma and end of line.
    // This will require reading documentation on split.
    public static List<String> splitWrapper(String string) {
        return new ArrayList<>();
    }

    // This can be implemented with one, short line of code!
    // Read some documentation about enumerated types.
    public static String enum2string(Pet mypet) {
        return "";
    }

    // Return the string representation for the given token in
    // the given string.
    public static String getLexeme(String s, int which) {
        Lexer lexer = new Lexer(s);
        return "";
    }

    // Return the sum of all the data on the given tree.
    public static int sumTree(TreeNode root) {
        return 0;
    }

    // Create a configuration string like what is needed for PA4 based on
    // given map.
    public static String createConfigStr(TreeMap<String, Boolean> map) {
        return "";
    }

}
