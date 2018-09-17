package bool_exp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * PA4ReadInputWriteDot -
 * 
 * @author Theodore Sackos (theodorejsackos@email.arizona.edu) Spring 2018
 *         Edited by mstrout@cs.arizona.edu Fall 2018
 *
 *         This class will read an input file name from the command line, and
 *         print out
 *         the dot representation of the Abstract Syntax Tree for the boolean
 *         logic
 *         expression in the input file.
 *
 *         The input file should contain only a single line, that line should
 *         contain a
 *         Java boolean expression limited to:
 *         - the NAND operator "NAND"
 *         - Parenthesis "(", ")"
 *         - and valid Java identifiers: i.e strings with no spaces that start
 *         with a letter, '$', or '_', followed by letters, digits, '$' and '_'
 *         characters
 *
 *         Usage:
 *           java PA4ReadInputWriteDot infile.in
 *
 *         ------------- Example -------------
 *         Input File:
 *         ----------------------------------
 *         | a NAND (b NAND $t) NAND _3 |
 *         | ...                        | <all other lines ignored>
 *         ----------------------------------
 *
 *         Output Dot Representation:
digraph expression_tree {
    1836019240 [label="NAND"];
    325040804 [label="NAND"];
    1173230247 [label="ID: a" shape=box];
    325040804 -> 1173230247;
    856419764 [label="NAND"];
    621009875 [label="ID: b" shape=box];
    856419764 -> 621009875;
    1265094477 [label="ID: $t" shape=box];
    856419764 -> 1265094477;
    325040804 -> 856419764;
    1836019240 -> 325040804;
    2125039532 [label="ID: _3" shape=box];
    1836019240 -> 2125039532;
}
 *
 *         These dot graphs can be rendered into .png/.pdf/.jpg format using the
 *         command
 *         line dot utility, for example:
 *         dot -Tpng dot.txt > dot.png
 *         However, I have been using
 *         http://sandbox.kidstrythisathome.com/erdos/ which
 *         works out really well.
 */
public class PA4ReadInputWriteDot {
    public static void main(String[] args){
        // Check that some input was provided
        if(args.length < 1 || args.length > 1){
            System.err.println(
                    "USAGE: java PA4ReadInputWriteDot <inputFile.txt>");
            System.exit(1);
        }

        // Get the expression from the file
        String expression = null;
        try(Scanner s = new Scanner(new File(args[0]));){
            expression = s.nextLine();
        }catch(FileNotFoundException e){
            System.err.printf("'%s' is not a valid file path.", args[0]);
            System.exit(1);
        }

        System.out.println(expression);

        // Call the parser to generate the AST for the expression
        ASTNode root     = BoolSatParser.parse(expression);

        // Traverse the AST and generate a dot representation
        String dotOutput = root.toDotString();

        // Output the dot representation to stdout
        System.out.println(dotOutput);
    }
}
