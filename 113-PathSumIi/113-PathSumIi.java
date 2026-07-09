// Last updated: 09/07/2026, 10:09:50
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root,targetSum,path,result);
        return result;
    }

    void dfs(TreeNode root,int target,List<Integer> path,List<List<Integer>> result){
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null && target == root.val){
            result.add(new ArrayList<>(path));
        }
        int rem = target - root.val;
        dfs(root.left,rem,path,result);
        dfs(root.right,rem,path,result);
        path.remove(path.size() - 1);
    }
}