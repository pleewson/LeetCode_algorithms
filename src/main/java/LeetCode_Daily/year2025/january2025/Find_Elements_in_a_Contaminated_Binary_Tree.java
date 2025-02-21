package LeetCode_Daily.year2025.january2025;

import nodes.TreeNode;

import java.util.HashSet;
//https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/submissions/1550645860/?envType=daily-question&envId=2025-02-21
public class Find_Elements_in_a_Contaminated_Binary_Tree {
    HashSet values = new HashSet();

    public Find_Elements_in_a_Contaminated_Binary_Tree(TreeNode root) {
        root.setVal(0);
        recoverTree(root);
        values.add(0);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-1, null, new TreeNode(-1));
        Find_Elements_in_a_Contaminated_Binary_Tree findElementsInAContaminatedBinaryTree = new Find_Elements_in_a_Contaminated_Binary_Tree(treeNode);

        boolean isTrue = findElementsInAContaminatedBinaryTree.find(1);
        System.out.println(isTrue);
    }

    public boolean find(int target) {
        return values.contains(target);
    }


    public void recoverTree(TreeNode node) {
        if (node == null) {
            return;
        }


        if (node.getLeft() != null) {
            node.getLeft().setVal(2 * node.getVal() + 1);
            values.add(node.getLeft().getVal());
            recoverTree(node.getLeft());
        }

        if (node.getRight() != null) {
            node.getRight().setVal(2 * node.getVal() + 2);
            values.add(node.getRight().getVal());
            recoverTree(node.getRight());
        }

    }
}
