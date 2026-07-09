// Last updated: 09/07/2026, 10:09:58
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
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean helper(TreeNode root,long lower,long upper){
        if(root == null) return true;
        if(root.val<=lower || root.val>=upper) return false;
        return helper(root.left,lower,root.val) && helper(root.right,root.val,upper);
    }
}