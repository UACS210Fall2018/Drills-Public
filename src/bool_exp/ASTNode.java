package bool_exp;

/**
 * class ASTNode --
 * 
 * @author Theodore Sackos (theodorejsackos@email.arizona.edu) Spring 2018
 *         Edited by mstrout@cs.arizona.edu Fall 2018
 *
 *         This node type makes up all of the internal nodes of the
 *         Abstract Syntax Tree for the expressions that are parsed
 *         by this library. ASTNodes have a type -- representing
 *         the computational operation being performed -- and a
 *         specific number of children depending on the type of
 *         operation. See NodeType enum
 * 
 *         Identifier nodes will have the name of their identifier in
 *         the id string field.
 */
public class ASTNode {
    /**
     * enum NodeType --
     * Describes the type of an AST node. Nodes for this grammar
     * can either have no children or two children.
     *
     * Terminal Nodes (Leaf) --
     * ID - Represents an Identifier in the expression, only leaf node.
     *
     * Binary Operators --
     * NAND - The logical NAND operator, evaluates to false if the child1
     * and child2 operands both evaluate to true; otherwise true.
     * 
     */
    private enum NodeType {
    NAND, ID;
    }

    // Whether the node is a NAND or ID.
    private NodeType type;

    // Facilitates variable number of children nodes.
    // Feel free to read directly, but should set using factory functions:
    // createNandNode() and createIdNode()
    public ASTNode child1, child2;

    // For ID type nodes, this field is the identifier name
    private String id;
    
    // Generic constructor. Private so use factory methods createNandNode() and
    // createIdNode()
    private ASTNode(NodeType t, String id, ASTNode child1, ASTNode child2) {
        this.type = t;
        this.id = id;
        this.child1 = child1;
        this.child2 = child2;
    }
    
    public static ASTNode createNandNode(ASTNode left, ASTNode right) {
        return new ASTNode(NodeType.NAND, "", left, right);
    }

    public static ASTNode createIdNode(String value) {
        return new ASTNode(NodeType.ID, value, null, null);
    }

    public boolean isNand() {
        return type == NodeType.NAND;
    }

    public boolean isId() {
        return type == NodeType.ID;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "ASTNode(" + type + "," + id + "," + child1 + "," + child2 + ")";
    }

    public String toDotString() {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph expression_tree {\n");
        dotHelp(dot);
        dot.append("}\n");
        return dot.toString();
    }

    /*
     * This function does the recursive traversal of the ASTNodes adding
     * to the dot output at each step of the traversal
     */
    private void dotHelp(StringBuilder dot) {

        // Do the work - define the content of the current node in dot format
        if (isId()) {
            dot.append(String.format("\t%d [label=\"ID: %s\" shape=box];\n",
                    hashCode(), id));
        } else {
            dot.append(String.format("\t%d [label=\"%s\"];\n", hashCode(),
                    type));
        }

        // recursively define all other children nodes before defining the
        // digraph edge between the current node and its children.
        if (child1 != null) {
            child1.dotHelp(dot);
            dot.append(String.format("\t%d -> %d;\n", hashCode(),
                    child1.hashCode()));
        }
        if (child2 != null) {
            child2.dotHelp(dot);
            dot.append(String.format("\t%d -> %d;\n", hashCode(),
                    child2.hashCode()));
        }
    }

}

