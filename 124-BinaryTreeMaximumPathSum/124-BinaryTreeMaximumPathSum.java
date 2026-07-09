// Last updated: 09/07/2026, 10:09:49
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
    int global = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        dfs(root);
        return global;
    }

    int dfs(TreeNode root){
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        left = Math.max(0,left);
        right = Math.max(0,right);
        global = Math.max(root.val + left + right,global);
        return root.val + Math.max(left,right);
    }
}