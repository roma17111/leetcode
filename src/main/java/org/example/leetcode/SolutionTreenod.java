package org.example.leetcode;

public class SolutionTreenod {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode node1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        isSameTree(node, node1);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return  isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}