package LeetCode_Easy;

import nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
public class Binary_Tree_Postorder_Traversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Binary_Tree_Postorder_Traversal binaryTreePostorderTraversal = new Binary_Tree_Postorder_Traversal();
        binaryTreePostorderTraversal.postorderTraversal(treeNode);

    }

    List<Integer> outputList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return outputList;
    }

    private void postorder(TreeNode root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        outputList.add(root.val);
    }

}
