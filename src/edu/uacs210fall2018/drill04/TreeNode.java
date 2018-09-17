package edu.uacs210fall2018.drill04;

public class TreeNode {
    public int data;

    public TreeNode child1;
    public TreeNode child2;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        data = val;
        child1 = left;
        child2 = right;
    }

    public String toString() {
        return "Node(" + data + ","
                + (child1 != null ? child1.toString() : "null") + ","
                + (child2 != null ? child2.toString() : "null") + ")";
    }
}
