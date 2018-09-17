package bool_exp;

/**
 * enum Token --
 * 
 * @author Theodore Sackos (theodorejsackos@email.arizona.edu) Spring 20189
 *         mstrout@cs.arizona.edu Fall 2018
 *
 *         The Token class represents all of the valid entities in
 *         a logical expression. See Lexer.java for test cases. Variables
 *         in the input expression are represented by the ID Token, &&
 *         by the NAND token etc.
 */
public class Token {
    private enum NodeType {
        NAND, ID, PAREN_LEFT, PAREN_RIGHT, ERROR
    }

    private final NodeType type; // The type of token
    private final String text; // For ID tokens, we also store the id name.
                               // Error the string.

    private Token(NodeType type, String text) {
        this.type = type;
        this.text = text;
    }

    // Creating various token instances
    static Token createLeftParen(){
        return new Token(NodeType.PAREN_LEFT, "(");
    }
    static Token createRightParen(){
        return new Token(NodeType.PAREN_RIGHT, ")");
    }

    static Token createNand() {
        return new Token(NodeType.NAND, "NAND");
    }

    static Token createId(String identifier){
        Token t = new Token(NodeType.ID, identifier);
        return t;
    }

    static Token createError(String lexeme) {
        Token t = new Token(NodeType.ERROR, lexeme);
        return t;
    }

    // Checking token type method
    boolean isNand() {
        return type.equals(NodeType.NAND);
    }

    boolean isId(){
        return type.equals(NodeType.ID);
    }

    boolean isLeftParen(){
        return type.equals(NodeType.PAREN_LEFT);
    }

    boolean isRightParen() {
        return type.equals(NodeType.PAREN_RIGHT);
    }

    boolean isError() {
        return type.equals(NodeType.ERROR);
    }

    public String getLexeme() {
        return text;
    }

    public String toString() {
        // If this token is an ID return the string "IDENTIFIER: <name>" otherwise
        // just return the type of the Token.
        if (type.equals(NodeType.ID) || type.equals(NodeType.ERROR)) {
            return (type + "(" + text + ")");
        } else {
            return type.toString();
        }
    }
}