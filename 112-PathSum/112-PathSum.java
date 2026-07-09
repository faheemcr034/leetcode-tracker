// Last updated: 09/07/2026, 10:09:53
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        int remaining_sum = targetSum - root.val;
        boolean left = hasPathSum(root.left,remaining_sum);
        boolean right = hasPathSum(root.right,remaining_sum);
        return left || right;

    }
}