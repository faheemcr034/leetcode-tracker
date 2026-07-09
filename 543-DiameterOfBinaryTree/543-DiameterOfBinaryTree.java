// Last updated: 09/07/2026, 10:07:43
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int global = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return global;
    }
    int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        global = Math.max(global,left + right);
        return 1 + Math.max(left,right);
    }
}