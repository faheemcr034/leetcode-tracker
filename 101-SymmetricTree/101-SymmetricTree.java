// Last updated: 09/07/2026, 10:09:57
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
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root.left,root.right);
    }
    boolean ismirror(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val!=right.val) return false;

        boolean outer = ismirror(left.left,right.right);
        boolean inner = ismirror(left.right,right.left);
        return outer && inner;
    }
}