// Last updated: 09/07/2026, 10:09:55
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
    public int maxDepth(TreeNode root) {
        return maxdepth(root);
    }
    int maxdepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = maxdepth(root.left);
        int right = maxdepth(root.right);
        return 1+ Math.max(left,right);
    }
}