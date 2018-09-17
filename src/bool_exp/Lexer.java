package bool_exp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * class Lexer --
 * 
 * @author Theodore Sackos (theodorejsackos@email.arizona.edu) Spring 2018
 *         mstrout@cs.arizona.edu, Fall 2018
 *
 *         Rewrote this one to significantly simplify. Spring 2018 lexer needed
 *         to handle more token types.
 *
 * Usage:
 *        import bool_exp.Lexer;
 * 
 *        Lexer lexer = new Lexer("x NAND y NAND (z NAND c)");
 *        ...
 *        while (lexer.hasNext()) {
 *            Token tok = lexer.nextToken();
 *        }
 * 
 * Recognizes Tokens: NAND ID LEFT_PAREN RIGHT_PAREN
 * 
 * Implementation:
 * Bit of a hack when it comes to lexing, but simple.
 */
public class Lexer {

    public Lexer(String input) {
        // this.input = input;
        this.currIndex = 0;

        // Splitting by any number of white spaces.
        // https://javarevisited.blogspot.com/2016/10/how-to-split-string-in-java-by-whitespace-or-tabs.html
        lexemeList = new ArrayList<>(Arrays.asList(input.trim().split("\\s+")));

        // separate out the left and right parens
        lexemeList = separateOutGivenChar(lexemeList, '(');
        lexemeList = separateOutGivenChar(lexemeList, ')');
    }

    
    public boolean hasNext() {
        return currIndex < lexemeList.size();
    }

    public Token peek() {
        Token tok = next();
        currIndex--;
        return tok;
    }

    public Token next() {
        if (!hasNext()) {
            return null;
        }
        String lexeme = lexemeList.get(currIndex);
        currIndex++;
        if (lexeme.equals("(")) {
            return Token.createLeftParen();
        } else if (lexeme.equals(")")) {
            return Token.createRightParen();
        } else if (lexeme.equals("NAND")) {
            return Token.createNand();
        } else {
            if (isJavaIdentifier(lexeme)) {
                return Token.createId(lexeme);
            } else {
                return Token.createError(lexeme);
            }
        }
    }

    // private String input;
    private int currIndex;
    List<String> lexemeList;

    // Return true if the given string is a Java identifier.
    // FIXME: optimistic assumption
    private boolean isJavaIdentifier(String lexeme) {
        return true;
    }

    // Given a list of Strings, break any strings with the given character into
    // multiple strings. One string for each time the character appears and then
    // other strings.
    // Eg. ["hello)(there)data","bye"] would become
    // ["hello",")","(there",")","data","bye"] if the given char was '('
    private List<String> separateOutGivenChar(List<String> lexemes, char c) {
        List<String> newList = new ArrayList<>();
        for (String lexeme : lexemes) {
            // use character class regex
            // http://javadevnotes.com/java-string-split-tutorial-and-examples
            // section about Empty Strings to explain -1
            String[] afterSplit = lexeme.split("[" + c + "]", -1);

            for (int j = 0; j < afterSplit.length - 1; j++) {
                if (afterSplit[j].length() >= 1) {
                    newList.add(afterSplit[j]);
                }
                newList.add(String.valueOf(c));
            }
            if (afterSplit[afterSplit.length - 1].length() >= 1) {
                newList.add(afterSplit[afterSplit.length - 1]);
            }

        }
        return newList;
    }

    // Testing Routine
    public static void main(String[] args){
        System.out.println("Logic tests");

        Lexer lexer = new Lexer("  x \tNAND (((y) NAND (z NAND c))) fds");

        System.out.println(lexer.hasNext());

        System.out.println(lexer.next());

        while (lexer.hasNext()) {
            System.out.println(lexer.next());
        }
    }
}
