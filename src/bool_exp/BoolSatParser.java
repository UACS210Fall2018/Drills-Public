package bool_exp;

/*
 * class BoolSatParser --
 * 
 * @author Theodore Sackos (theodorejsackos@email.arizona.edu) Spring 2018
 *         rewrite, mstrout@cs.arizona.edu, Fall 2018
 *
 *  This class implements a Recursive Descent Parser to produce
 *  Syntax Trees for boolean logic expressions with variables and NAND.
 *
 * Usage:
 *     ASTNode root = BoolSatParser.parse("a NAND b NAND c");
 *     String dotString = root.toDotString();
 *
 * Straight-forward but ambiguous grammar:
 *  E -> E NAND E | (E) | <java identifier>
 *  
 * Unambiguous grammar with precedence encoded:
 *  E -> E NAND F | F   // this could be a list of F
 *  F -> (E) | <java identifier>
 *
 * Left factoring:
 *  E  -> F E'
 *  E' -> NAND F E' | epsilon
 *  F -> (E) | <java identifier>
 * 
 * After factoring, no longer left recursive:
 * https://en.wikipedia.org/wiki/Left_recursion#Removing_left_recursion
 *  parseE ->  parseF parseE'
 *  parseF  -> LEFT_PAREN parseE RIGHT_PAREN | <java id>
 *  parseE' -> 'NAND' parseF parseE' | ε
 */
public class BoolSatParser {
    /**
     * parse(String) --
     * The parse function instantiates a lexer (Lexer object to produce
     * a sequence of Tokens) and returns an Abstract Syntax Tree root node.
     */
    public static ASTNode parse(String expression){
        return parseE(new Lexer(expression));
    }

    /* ------------------------------------
     * Recursive Descent Parsing Functions:
     * ------------------------------------ */
    // parseF -> LEFT_PAREN parseE RIGHT_PAREN | <java id>
    private static ASTNode parseF(Lexer lexer) {
        ASTNode root = null;
        Token tok = lexer.next();

        // LEFT_PAREN parseE RIGHT_PAREN
        if (tok.isLeftParen()) {
            root = parseE(lexer);

            // RIGHT_PAREN
            tok = lexer.next();
            if (!tok.isRightParen()) {
                announceParsingError("Expecting RIGHT_PAREN, got " + tok);
            }

        }
        // <java id>
        else if (tok.isId()) {
            root = ASTNode.createIdNode(tok.getLexeme());
        }
        else {
            announceParsingError("Expecting LEFT_PAREN or ID, got " + tok);
        }

        return root;
    }

    // parseE -> parseF parseE'
    private static ASTNode parseE(Lexer lexer) {

        // If the token sequence is empty, then we have no parsing to do
        if (!lexer.hasNext()) {
            return null;
        }
        ASTNode left = parseF(lexer);
        return parseEPrime(lexer, left);
    }

    private static void announceParsingError(String errorMessage) {
        System.err.println("ERROR: " + errorMessage);
        System.exit(1);
    }

    // parseE' -> 'NAND' parseF parseE' | ε
    private static ASTNode parseEPrime(Lexer lexer, ASTNode left) {
        Token tok = lexer.peek(); // need to peek due to epsilon

        // 'NAND' parseF parseE' | ε
        if (tok != null && tok.isNand()) {
            // move the lexer forward to consume NAND
            lexer.next();

            // parse the next expression
            ASTNode right = parseF(lexer);

            // Left associativity fix up
            ASTNode nandNode = ASTNode.createNandNode(left, right);

            return parseEPrime(lexer, nandNode);

        } else { // ε
            return left;
        }
    }

    public static void main(String[] args){
        System.out.println(parse("isDone").toDotString());
        System.out.println(parse("isDone NAND failed").toDotString());
        System.out.println(parse("a NAND b NAND c").toDotString());
        System.out
                .println(parse("  x \tNAND (( (y) NAND (z NAND c))) NAND fds")
                        .toDotString());
        System.out.println(parse("a NAND (b NAND $t) NAND _3").toDotString());
    }
}
