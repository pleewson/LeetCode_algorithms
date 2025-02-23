package LeetCode_Daily.year2025.febuary2025;

import nodes.TreeNode;

import java.util.Arrays;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/?envType=daily-question&envId=2025-02-23

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};

//        Output: [1,2,3,4,5,6,7]

        System.out.println(constructFromPrePost(preorder, postorder));
    }

    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder == null || postorder == null || preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return root;
        }

        int leftRoot = preorder[1];
        int leftSize = 0;

        while (postorder[leftSize] != leftRoot) {
            leftSize++;
        }
        leftSize++;


        root.left = constructFromPrePost(
                Arrays.copyOfRange(preorder, 1, leftSize + 1),
                Arrays.copyOfRange(postorder, 0, leftSize)
        );

        root.right = constructFromPrePost(
                Arrays.copyOfRange(preorder, leftSize + 1, preorder.length),
                Arrays.copyOfRange(postorder, leftSize, postorder.length - 1)
        );

        return root;
    }
}
